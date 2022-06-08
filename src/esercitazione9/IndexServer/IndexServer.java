package esercitazione9.IndexServer;
import java.io.*;
import java.net.*;
import java.util.*;


public class IndexServer {
    private Map<File, InetAddress> data;

    private final int uPort = 3000;         //porta sulla quale riceve info da StorageServer
    private final int tPort = 4000;         //porta sulla quale riceve richieste da Client

    private ServerSocket server;
    private DatagramSocket uSocket;

    public IndexServer(){
        //struttura dati thread-safe
        data = Collections.synchronizedMap(new HashMap<File, InetAddress>());
        System.out.println("IndexServer in fase di avvio");
        inizia();
    }//constructor

    private void inizia(){
        try{
            server = new ServerSocket(tPort);
            System.out.println(server);
            uSocket = new DatagramSocket(uPort);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        new GestisciFile().start();         //thread per la gestione richieste da StorageServer
        new GestisciClient().start();       //thread per la gestione richieste da Client
    }//inizia

    class GestisciFile extends Thread{

        public void run(){
            //info da StorageServer
            while(true){
                try{
                    byte[] buf = new byte[256];
                    //riceve il pacchetto
                    DatagramPacket packet = new DatagramPacket(buf, buf.length);
                    System.out.println("Attesa nuovo pacchetto...");
                    uSocket.receive(packet);

                    String msg = new String(packet.getData());
                    System.out.println(msg);

                    String[] parti = msg.split("#");
                    String[] keywords = parti[1].split(",");

                    File file = new File(parti[0], keywords, "");
                    System.out.format("Aggiungo il file %s inviato da %s%n", parti[0], packet.getAddress());
                    data.put(file, packet.getAddress());        //salvo il file nella struttura dati
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }//run
    }//GestisciFile

    class GestisciClient extends Thread{

        public void run(){
            while(true){
                try{
                    //1 ricevi ricerca nomeFile#attributo1,attributo2
                    System.out.println("Attesa nuova ricerca...");
                    Socket tSocket = server.accept();
                    BufferedReader br = new BufferedReader(new InputStreamReader(tSocket.getInputStream()));

                    String msg = br.readLine();
                    System.out.println("Ricevi la ricerca " + msg);

                    String[] parti = msg.split("#");
                    String[] keywords = parti[1].split(",");

                    System.out.format("Ricevo la ricerca con filename %s e chiavi %s%n", parti[0],parti[1]);

                    String ret = "";
                    synchronized (data){        //per evitare ConcurrentModificationException enl for
                        for(Map.Entry<File, InetAddress> entry : data.entrySet()){
                            File file = entry.getKey();

                            if(file.getFilename().equals(parti[0])){
                                boolean trovato = true;
                                for(int i = 0; i< keywords.length && trovato; i++){
                                    trovato = false;
                                    for(int j = 0; j < file.getKeywords().length; j++){
                                        if(keywords[i].equals(file.getKeywords()[j])){
                                            trovato = true;
                                            break;
                                        }
                                    }//for2
                                }//for1
                                if(trovato)
                                    ret += entry.getValue().toString();
                            }
                        }//forEntry
                    }//synchronized

                    //rispondi al client
                    System.out.println("Invio la risposta " + ret);
                    PrintWriter pw = new PrintWriter(tSocket.getOutputStream(),true);
                    pw.println(ret);
                    br.close();
                    pw.close();
                    tSocket.close();
                }catch(IOException ioe){
                    ioe.printStackTrace();
                }//try
            }//while
        }//run
    }//GestisciClient

    public static void main(String[] args){
        IndexServer indexS = new IndexServer();
    }//main

}//IndexServer