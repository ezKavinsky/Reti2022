package esercitazione3.test;
import java.io.*;
import java.net.*;
import java.util.*;

public class MulticastTimeClient {

    public static void main(String[] args) throws IOException{
        MulticastSocket socket = new MulticastSocket(3575);
        InetAddress group = InetAddress.getByName("230.0.0.1");
        socket.joinGroup(group);
        DatagramPacket packet;
        for(int i = 0; i < 100; i++){
            byte[] buf = new byte[256];
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String received = new String(packet.getData());
            System.out.println("Time: " + received);
        }
        socket.leaveGroup(group);
        socket.close();
    }//main

}//MulticastTimeClient
