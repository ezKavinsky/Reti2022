package appelli.Settembre2019.Clinica;
import java.util.*;
import java.net.*;
import java.io.*;

public class Server {
    private static final int pPort = 3000;
    private static final int dPort = 5000;
    private static final String dAddress = "localhost";
    private HashMap<Integer, Esame> esami;
    private ServerSocket server;
    private Calendar chiusura;

    public Server(){
        esami = new HashMap<>();
        System.out.println("Clinica aperta fino alle 12");
        try{
            server = new ServerSocket(pPort);
            new GestionePrenotazioni().start();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//constructor


    class GestionePrenotazioni() extends Thread{
        Socket client;
        Calendar now;
        int numero = 0;

        public GestionePrenotazioni(){
            now = Calendar.getInstance();
        }//constructor

        public void run(){
            while (true) {
                try {
                    //Configuro il gestore e controllo la coda
                    server.setSoTimeout((int)(chiusura.getTimeInMillis() - now.getTimeInMillis()));
                    controllaCoda();

                    //Ricevo la richiesta
                    client = server.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    int codice = Integer.parseInt(in.readLine());

                    //Controlla la richiesta
                    Prenotazione p = controllaRichiesta(codice);
                    if(p != null){
                        ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                        out.writeObject(p);
                    }

                } catch ()
            }
        }//run

    }//GestionePrenotazioni
}//Server
