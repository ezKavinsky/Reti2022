package esercitazione6.GaraAppalto;
import java.io.*;
import java.net.*;

public class Ente {

    public static void main(String[] args) throws ClassNotFoundException{
        String GIUDICE_ADDRESS = "127.0.0.1";
        int GIUDICE_PORT = 2000;
        try{
            //Invio richiesta gara di appalto
            Socket socket = new Socket(GIUDICE_ADDRESS, GIUDICE_PORT);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(new Richiesta("Costruzione Stadio Arcavacata", 100000));

            //Mi metto in attesa dell'offerta vincente
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Offerta offertaMigliore = (Offerta) in.readObject();
            System.out.println("Ricevuta offerta migliore:" + offertaMigliore);
        }catch(IOException ioe) { ioe.printStackTrace(); }
    }//main

}//Ente
