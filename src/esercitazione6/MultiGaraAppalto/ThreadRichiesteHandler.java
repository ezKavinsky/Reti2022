package esercitazione6.MultiGaraAppalto;
import java.io.*;
import java.net.*;

public class ThreadRichiesteHandler extends Thread{
    private ServerSocket socket;
    private RegistroGare registro;
    private final static int rPort = 2000;

    public ThreadRichiesteHandler(RegistroGare registro) throws IOException {
        this.registro = registro;
        this.socket = new ServerSocket(rPort);
    }//constructor

    public void run(){
        try{
            while(true){
                Socket socketRichiesta = socket.accept();
                ObjectInputStream ois = new ObjectInputStream(socketRichiesta.getInputStream());
                Richiesta richiesta = (Richiesta) ois.readObject();
                System.out.println("Ricevuta nuova richiesta: " + richiesta);
                //Aggiungo la richiesta di gara al registro
                int idGara = registro.addGara(socketRichiesta, richiesta);
                //Avvio thread per gestire il timeout sulle offerte per questa gara
                new ThreadTimeoutHandler(idGara, registro).start();
            }
        }catch(IOException | ClassNotFoundException e){ e.printStackTrace(); }
    }//run

}//ThreadRichiesteHandler