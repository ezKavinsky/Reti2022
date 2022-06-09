package esercitazione10.Intermediario;
import java.net.*;
import java.io.*;
import java.util.*;

public class RichiestaHandler extends Thread{
    private Socket socket;
    private List<Venditore> venditori;
    private List<Risposta> risposte;

    public RichiestaHandler(Socket s, List<Venditore> venditori){
        this.socket = s;
        this.venditori = venditori;
        this.risposte = Collections.synchronizedList(new LinkedList<Risposta>());
    }//constructor

    public void storeRisposta(Risposta risposta){
        this.risposte.add(risposta);
    }//storeRisposta

    public void run(){
        try{
            ObjectInputStream  ois = new ObjectInputStream(socket.getInputStream());
            Richiesta richiesta = (Richiesta) ois.readObject();

            //invia la richiesta ai Venditori
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(richiesta);
            oos.flush();
            byte[] buf = baos.toByteArray();

            for(Venditore venditore : venditori){
                //Invio richiesta a venditore
                DatagramSocket socketV = new DatagramSocket();
                socketV.setSoTimeout(60000);                    //imposto timeout a 60s
                InetAddress vAddress = InetAddress.getByName(venditore.getAddress());
                DatagramPacket packet = new DatagramPacket(buf, buf.length, vAddress, venditore.getPort());
                socketV.send(packet);
                new RispostaHandler(socketV, this).start();
            }
            Risposta minRisp = new Risposta(richiesta.getIdProdotto(), richiesta.getQuantita(), Integer.MAX_VALUE, -1);
            for(Risposta r : risposte){
                if(r.getPrezzo() < minRisp.getPrezzo()){
                    minRisp = r;
                }
            }

            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            os.writeObject(minRisp);
            os.flush();
            socket.close();
        }catch(Exception e){
            System.err.println(e);
        }

    }//run
}//RichiesteHandler
