package esercitazione6.GaraAppalto;
import java.io.*;
import java.net.*;
import java.util.Random;


public class Partecipante extends Thread{
    private int id;
    private final String GIUDICE_ADDRESS = "127.0.0.1";

    public Partecipante(int id){
        this.id = id;
    }//constructor

    @Override
    public void run(){
        System.out.println("Avviato partecipante con ID " + this.id);
        MulticastSocket mSocket = null;
        try{
            //Ricevo richiesta offerta
            mSocket = new MulticastSocket(3000);
            InetAddress group = InetAddress.getByName("230.0.0.1");
            mSocket.joinGroup(group);

            byte[] buf = new byte[512];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            mSocket.receive(packet);

            String richiesta = new String(packet.getData());
            String[] richiestaParts = richiesta.split("-");

            String descrizione = richiestaParts[0];
            int importoMax = Integer.parseInt(richiestaParts[1].trim());

            System.out.println("Ricevuto pacchetto multicast: " + richiesta);

            //Rispondo al giudice
            Socket socket = new Socket(GIUDICE_ADDRESS, 4000);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            Offerta offerta = new Offerta(id, new Random().nextInt(10000));
            out.writeObject(offerta);
            socket.close();
            System.out.println("Inviata offerta: " + offerta);

            //Attendo esito offerte
            mSocket.receive(packet);
            System.out.println("Ricevuto pacchetto multicast: " + importoMax);

            String[] parts = new String(packet.getData()).split("-");
            System.out.println("Vincitore offerte con ID: " + parts[0]);
            System.out.println("Importo offerta vincente: " + parts[1]);
        }catch(IOException ioe){ ioe.printStackTrace(); }
    }//run


    public static void main(String[] args){
        int n = 10;
        for(int i =0; i < n; i++){
            new Partecipante(i).start();
        }
    }//main

}//Partecipante
