package esercitazione1.test;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoServerClient {

    public static void main(String[] args){
        try{
            InetAddress URL = InetAddress.getLocalHost();
            int port = 8189;
            Socket s = new Socket(URL,port);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            Scanner sc = new Scanner(System.in);
            String line = in.readLine();
            System.out.println(line);
            boolean done = false;
            while(!done) {
                System.out.print("Client: ");
                String frase = sc.nextLine();
                out.println(frase);
                line = in.readLine();
                if(line == null)
                    done = true;
                else
                    System.out.println(line);
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }//main

}//EchoServerClient
