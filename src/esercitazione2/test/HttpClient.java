package esercitazione2.test;
import java.io.*;
import java.net.*;

public class HttpClient {

    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",8188);
            System.out.println("Client in communication with server on port: " + 8188);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            out.println("GET /home HTTP/1.1");
            while(true){
                String line = in.readLine();
                if(line == null)
                    break;
                System.out.println(line);
            }
            String line = in.readLine();
            System.out.println(line);
        }catch(Exception e){
            System.err.println(e);
        }
    }//main


}//HttpClient
