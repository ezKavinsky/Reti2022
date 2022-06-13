package appelli.Maggio2020.GestioneAste;
import java.net.*;
import java.util.*;
import java.io.*;

public class Server {
    private LinkedList<Prodotto> prodotti;
    private static int oPort = 3000;
    private static int cPort = 4000;


    public Server(){
        this.prodotti = new LinkedList<>();
        try{
            ServerSocket offerte = new ServerSocket(oPort);
            System.out.println(offerte);
            System.out.println("Inizio dal primo prodotto...");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//constructor

    public static void main(String[] args){

    }//main

    public void aggiungiProdotto(Prodotto prodotto){
        if(!(prodotti.contains(prodotto.getCodice())))
            prodotti.add(prodotto);
    }//aggiungiProdotto



}//Server
