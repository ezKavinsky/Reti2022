package appelli.Gennaio2018.Intermediario;
import java.io.*;
import java.net.*;

public class Cliente {
    private int myPort;
    private InetAddress sAddress;
    private final static int sPort = 2345;
    private Socket s;

    public Cliente(int myPort, InetAddress sAddress){
        this.myPort = myPort;
        this.sAddress = sAddress;
        try{
            s = new Socket(sAddress,sPort);
            System.out.println("Instaurata connessione con il server all'indirizzo " + sAddress);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//constructor

    public void inviaRichiesta(Richiesta r){
        try {
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

            //Invio la richiesta
            System.out.println("Invio la richiesta " + r);
            out.writeObject(r);
            System.out.println("Richiesta inviata");
            out.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//inviaRichiesta

    public Risposta offertaMigliore(){
        Risposta risposta = null;
        try{
            System.out.println("Mi metto in attesa per ricevere la risposta");
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());

            //Ricevo la risposta migliore
            risposta = (Risposta)in.readObject();
            in.close();
            s.close();
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
        return risposta;
    }//offertaMigliore

    public static void main(String[] args){
        try{
            InetAddress server = InetAddress.getByName("localhost");
            Cliente c = new Cliente(8001, server);
            Richiesta r = new Richiesta(15,2);
            c.inviaRichiesta(r);
            System.out.println("Per la mia richiesta la risposta migliore è stata " + c.offertaMigliore());
        }catch(IOException ioe){ioe.printStackTrace();}
    }

}//Cliente
