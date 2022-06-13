package appelli.Gennaio2018.Intermediario;

import esercitazione10.Intermediario.Venditore;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class Intermediario {
    private final static int cPort = 2345;
    private List<Venditore> venditori;

    public Intermediario(List<Venditore> venditori){
        this.venditori = venditori;
    }//constructor

    public List<Venditore> getVenditori() {
        return venditori;
    }

    public static void main(String[] args){
        //Ricevi richieste dai client
        Intermediario i = new Intermediario(new LinkedList<Venditore>());
        try{
            ServerSocket server = new ServerSocket(2345):
            while(true){
                Socket s = server.accept();
                RichiestaHandler t = new RichiestaHandler(s, i.getVenditori());
                t.start();
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//main

}//Intermediario
