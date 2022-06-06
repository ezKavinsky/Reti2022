package esercitazione6.MultiGaraAppalto;
import java.io.*;
import java.net.Socket;
import java.util.Random;

public class Ente extends Thread {
    private static String GIUDICE_ADDRESS = "127.0.0.1";
    private static int GIUDICE_PORT = 2000;
    private static int countOpere = 0;
    private static int idEnte;

    public Ente(int idEnte){
        this.idEnte = idEnte;
    }

    public void run(){
        try{
            sleep(new Random().nextInt(60000));         //Invio richiesta con tempi casuali
            //Invio richiesta gara di appalto
            Socket socket = new Socket(GIUDICE_ADDRESS, GIUDICE_PORT);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            Richiesta richiesta = new Richiesta(idEnte, "Opera " + (++countOpere), 100000);
            out.writeObject(richiesta);
            System.out.println("Inviata " + richiesta);

            //Mi metto in attesa dell'offerta vincente
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Offerta offertaMigliore = (Offerta) in.readObject();
            System.out.println("Ricevuta offerta migliore:" + offertaMigliore);
        }catch(Exception e) { e.printStackTrace(); }
    }//run

    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            new Ente(i).start();
        }
    }//main

}//Ente
