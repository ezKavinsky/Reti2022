package esercitazione6.MultiGaraAppalto;
import java.io.*;
import java.net.*;
import java.util.Random;


public class Partecipante extends Thread{
    private int id;
    private final String GIUDICE_ADDRESS = "127.0.0.1";

    public Partecipante(int id){
        this.id = id;
    }//constructor

    private void gestisciRichiesta(String[] richiestaParts) throws Exception{
        int idGara = Integer.parseInt(richiestaParts[1]);
        int importoMax = Integer.parseInt(richiestaParts[3].trim());
        sleep(new Random().nextInt(60000));

        //Rispondo al Giudice
        Socket socket = new Socket(GIUDICE_ADDRESS, 4000);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

        Offerta offerta = new Offerta(this.id, idGara, new Random().nextInt(importoMax));
        out.writeObject(offerta);
        System.out.println("Inviata offerta: " + offerta);
        socket.close();
    }//gestisciRichiesta

    @Override
    public void run(){
        System.out.println("Avviato partecipante con ID " + this.id);
        MulticastSocket mSocket = null;
        try{
            //Ricevo richiesta offerta
            mSocket = new MulticastSocket(3000);
            InetAddress group = InetAddress.getByName("230.0.0.1");
            mSocket.joinGroup(group);
            while(true) {
                byte[] buf = new byte[512];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                mSocket.receive(packet);

                String richiesta = new String(packet.getData());
                String[] richiestaParts = richiesta.split("-");
                System.out.println("Ricevuto pacchetto multicast: " + richiesta);
                if (richiestaParts[0].equals("RICHIESTA")) {
                    gestisciRichiesta(richiestaParts);      //stampo esito offerte gare scadute
                } else
                    System.out.println(richiesta);
            }
        }catch(Exception ioe){ ioe.printStackTrace(); }
    }//run


    public static void main(String[] args){
        int n = 10;
        for(int i =0; i < n; i++){
            new Partecipante(i).start();
        }
    }//main

}//Partecipante
