package esercitazione9.IndexServer;
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args){
        try{
            //FASE 1: memorizza file
            File file = new File("prova", new String[]{"a", "b", "c"},"...");
            System.out.println("Salva il file " + file);
            Socket tSocket = new Socket("localhost", 2000);     //apre socket con StorageServer
            ObjectOutputStream oos = new ObjectOutputStream(tSocket.getOutputStream());

            oos.writeObject(file);
            oos.flush();
            oos.close();
            tSocket.close();

            Thread.sleep(3000);

            file = new File("gatto", new String[]{"a", "b"}, "...");
            System.out.println("Salva il file " + file);
            tSocket = new Socket("localhost", 2000);
            oos = new ObjectOutputStream(tSocket.getOutputStream());

            oos.writeObject(file);
            oos.flush();
            oos.close();
            tSocket.close();

            Thread.sleep(3000);

        }catch(Exception e){
            e.printStackTrace();
        }

        //Fase 2: ricerca file
        try{
            //ricerca file
            String ricerca = "gatto#a,b";
            System.out.println("Ricerca tutti i file identificati da " + ricerca);
            Socket tSocket = new Socket("localhost", 4000);     //apre soscket con IndexServer
            PrintWriter pw =  new PrintWriter(tSocket.getOutputStream(), true);
            pw.println(ricerca);

            BufferedReader br = new BufferedReader(new InputStreamReader(tSocket.getInputStream()));

            String risposta = br.readLine();
            System.out.println("Risultato ricerca: " + risposta);

            br.close();
            pw.close();
            tSocket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main
}//Client
