package appelli.Settembre2019.WSDL;

import java.util.HashMap;
import java.util.Map;

public class Magazzino {
    private int id;
    private HashMap<Integer, Prodotto> listaProdotti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public String toString(){
        String lista = "";
        for(Map.Entry<Integer, Prodotto> entry : listaProdotti.entrySet()){
            lista += entry.toString() + ",\n";
        }
        return "Magazzino[ id= " + id + lista;
    }//toString

}//Magazzino
