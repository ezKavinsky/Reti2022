package esercitazione2.test;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.net.*;

public class TimeServer {

    public static void main(String[] args){
        DatagramSocket socket = null;
        try{
            socket = new DatagramSocket(3575);
            int n = 1;
            while(n <= 10){
                byte[] buf = new byte[256];
                //riceve la richiesta
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                //produce la risposta
                String dString = new Date().toString();
                buf = dString.getBytes();
                //invia la risposta al client
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buf, buf.length,address,port);
                socket.send(packet);
                n++;
            }
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
            socket.close();
        }
    }//main

}//TimeServer
