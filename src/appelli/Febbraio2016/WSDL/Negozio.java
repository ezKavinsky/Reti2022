package appelli.Febbraio2016.WSDL;

import java.util.HashMap;
import java.util.LinkedList;

public class Negozio {
    int id;
    HashMap<Integer, Prodotto> prodotti;

    public Negozio(HashMap<Integer,Prodotto> prodotti){
        this.prodotti = prodotti;
    }//constructor

    public HashMap<Integer,Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(HashMap<Integer,Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public int getId() {
        return id;
    }

}//Negozio
