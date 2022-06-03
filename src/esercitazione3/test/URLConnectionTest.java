package esercitazione3.test;
import java.io.*;
import java.net.*;
import java.util.*;

public class URLConnectionTest {

    public static void main(String[] args){
        try{
            URL url = new URL("http://www.w3.org");
            URLConnection connection = url.openConnection();
            connection.connect();

            //print header fields
            int n= 1;
            String key;
            while((key = connection.getHeaderFieldKey(n)) != null){
                String value = connection.getHeaderField(n);
                System.out.println(key + ": " + value);
                n++;
            }

            //print convenience functions
            System.out.println("-----------");
            System.out.println("getContentType: " + connection.getContentType());
            System.out.println("getContentLength: " + connection.getContentLength());
            System.out.println("getContentEncoding: " + connection.getContentEncoding());
            System.out.println("getDate: " + connection.getDate());
            System.out.println("getExpiration: " + connection.getExpiration());
            System.out.println("getLastModified: " + connection.getLastModified());
            System.out.println("-----------");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            //print first
            String line;
            int m = 1;
            while((line = in.readLine()) != null && m <= 10){
                System.out.println(line);
                m++;
            }
            if(line != null)
                System.out.println("...");
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }//main
}//URLConnectionTest
