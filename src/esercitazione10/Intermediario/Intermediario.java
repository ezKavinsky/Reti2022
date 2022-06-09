package esercitazione10.Intermediario;
import java.io.*;
import java.net.*;
import java.util.*;

public class Intermediario {
    private final static int rPort = 2345;
    private List<Venditore> venditori;

    public Intermediario(List<Venditore> venditori){
        this.venditori = venditori;
    }//constructor

    public List<Venditore> getVenditori(){
        return venditori;
    }//getVenditori

    public static void main(String[] args){
        //Fase 1: ricevi richiesta dai client
        Intermediario i = new Intermediario(new LinkedList<Venditore>());
        try{
            ServerSocket server = new ServerSocket(rPort);
            while(true){
                Socket socket = server.accept();
                RichiestaHandler t = new RichiestaHandler(socket, i.getVenditori());
                t.start();
            }
        }catch(IOException ioe){

        }
    }//main
}//Intermediario
