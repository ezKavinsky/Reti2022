package appelli.Maggio2020.GestioneAste;
import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args){
        //Fase 1: attendo di ricevere una notifica di un asta
        try {
            byte[] buf = new byte[256];
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);

            //Fase 1.1: elaboro la notifica ricevuta
            String msg = new String(packet.getData());
            String[] parts = msg.split(",");
            String prodotto = parts[1];
            String durata = parts[2];
            int prezzo = Integer.parseInt(parts[3]);

        }catch()


    }//main



}//Cliente
