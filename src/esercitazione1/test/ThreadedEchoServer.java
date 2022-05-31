package esercitazione1.test;
import java.io.*;
import java.net.*;

public class ThreadedEchoServer {

    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(8189);
            while(true){
                Socket incoming = server.accept();
                new ThreadedEchoHandler(incoming).start();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//main

    static class ThreadedEchoHandler extends Thread{
        private Socket incoming;

        public ThreadedEchoHandler(Socket i){
            incoming = i;
        }//constructor

        public void run(){
            try{
                BufferedReader in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
                PrintWriter out = new PrintWriter(incoming.getOutputStream(),true);
                out.println("Hello! Enter BYE to exit.");
                boolean done = false;
                while(!done){
                    String line = in.readLine();
                    if(line == null)
                        done = true;
                    else{
                        System.out.println("Echo: " + line);
                        if(line.trim().equals("BYE"))
                            done = true;
                    }
                }
                incoming.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }//run
    }//ThreadedEchoHandler

}//ThreadedEchoServer
