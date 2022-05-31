package esercitazione1.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class printAddress {

    static void printLocalAddress(){
        try{
            InetAddress myself = InetAddress.getLocalHost();
            System.out.println("My name : " + myself.getHostName());
            System.out.println("My IP address : " + myself.getHostAddress());

        }catch(UnknownHostException e){
            System.out.println("Failed to find myself");
        }
    }//printLocalAddress

    static void printRemoteAddress(String name){
        try{
            InetAddress host = InetAddress.getByName(name);
            System.out.println("Host name : " + host.getHostName());
            System.out.println("Host IP : " + host.getHostAddress());
        }catch(UnknownHostException e){
            System.out.println("Failed to find the host with name " + name);
        }
    }//printRemoteAddress

}//printAddress
