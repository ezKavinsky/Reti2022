package appelli.Settembre2019.Clinica;
import java.net.*;
import java.io.*;

public class Paziente {
    private InetAddress sAddress;
    private static final int sPort = 3000;
    private int myPort;
    private Socket s;
    private int prenotazione;
    private int codice;
    private boolean prenotato = false;

    public Paziente(int myPort, InetAddress sAddress){
        this.myPort = myPort;
        this.sAddress = sAddress;
        try{
            s = new Socket(sAddress,sPort);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    public boolean prenotami(int cod) {
        String ris = "";
        try {
            //Invio la richiesta
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            String pren = String.valueOf(cod);
            out.println(pren);

            //Aspetto la risposta del server
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ris = in.readLine();
            if (!(ris.equals("Service not available"))) {
                String[] parts = ris.split(",");
                codice = Integer.parseInt(parts[0]);
                prenotazione = Integer.parseInt(parts[1]);
                prenotato = true;
            } else
                System.out.println("Prenotazione non effettuata");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return prenotato;
    }//prenotami

    public disdici(int)
}//Paziente
