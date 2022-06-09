package esercitazione10.Intermediario;
import java.net.*;

public class RispostaHandler extends Thread{
    private DatagramSocket socket;
    private RichiestaHandler handler;

    public RispostaHandler(DatagramSocket socketV, RichiestaHandler handler){
        this.socket = socketV;
        this.handler = handler;
    }//constructor

    public void run(){
        try{
            DatagramPacket packet;
            while(true){
                byte[] buf = new byte[512];
                packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                String received = new String(packet.getData());
                String[] parts = received.split(",");
                int idProdotto = Integer.parseInt(parts[0]);
                int quantita = Integer.parseInt(parts[1]);
                int prezzo = Integer.parseInt(parts[2]);
                int idVenditore = Integer.parseInt(parts[3]);
                this.handler.storeRisposta(new Risposta(idProdotto, quantita, prezzo, idVenditore));
            }
        }catch(Exception e){
            this.socket.close();
            System.out.println("Fine risposte dal venditore");
        }
    }//run

}//RispostaHandler
