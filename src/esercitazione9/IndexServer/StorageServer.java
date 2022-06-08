package esercitazione9.IndexServer;

import java.io.*;
import java.net.*;
import java.util.HashMap;

public class StorageServer {
    private HashMap<String, File> data;             //struttura dati interna allo StorageServer
    private final int myPort = 2000;                //porta di attesa connessioni da parte dei Client
    private final String indexServerAddress;
    private final int indexServerPort = 3000;       //porta per invio richieste all'IndexSever
    private ServerSocket server;

    public StorageServer(String indexServerAddress){
        this.indexServerAddress = indexServerAddress;
        data = new HashMap<String, File>();
        System.out.println("StorageServer in fase di avvio");
        inizia();
    }//constructor

    public void inizia(){
        try{
            server = new ServerSocket(myPort);
        }catch(IOException ioe){ ioe.printStackTrace(); }
        while(true){
            memorizzaFile();
        }
    }//inizia

    private void memorizzaFile(){
        try{
            //1 ricevi file
            System.out.println("In attesa di memorizzare un file...");
            Socket tSocket = server.accept();
            ObjectInputStream ois = new ObjectInputStream(tSocket.getInputStream());
            File file = (File) ois.readObject();
            ois.close();
            tSocket.close();

            //1.1 memorizza nella struttura dati
            data.put(file.getFilename(), file);
            System.out.println("Ho memorizzato il file " + file);

            //2 invia info all'IndexServer
            System.out.println("Invio datagramma all'IndexServer");
            DatagramSocket uSocket = new DatagramSocket();

            //2.1 prepara la stringa da inviare composta da nomeFile#attributo1,attricuto2
            String msg = file.getFilename() + "#";
            for(String key : file.getKeywords()){
                msg += key +",";
            }

            //2.2 preparo il pacchetto e lo invio
            byte[] buf = msg.getBytes();
            InetAddress address = InetAddress.getByName(indexServerAddress);
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, indexServerPort);
            uSocket.send(packet);
            uSocket.close();

        }catch(IOException ioe){ ioe.printStackTrace(); }
         catch(ClassNotFoundException cnfe){ cnfe.printStackTrace(); }
    }//memorizzaFile

    //launcher del server
    public static void main(String[] args){
        StorageServer storageS = new StorageServer("localhost");
    }//main

}//StorageServer