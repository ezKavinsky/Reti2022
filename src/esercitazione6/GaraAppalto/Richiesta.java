package esercitazione6.GaraAppalto;

import java.io.Serializable;

public class Richiesta implements Serializable {
    private String descrizione;
    private int importoMassimo;

    public Richiesta(String descrizione, int importoMassimo){
        this.descrizione = descrizione;
        this.importoMassimo = importoMassimo;
    }//constructor

    public String getDescrizione() {
        return descrizione;
    }//getDescrizione

    public int getImportoMassimo() {
        return importoMassimo;
    }//getImportMassimo

    @Override
    public String toString(){
        return "Richiesta{ descrizione= '" + descrizione + "',\n importoMassimo= " + importoMassimo + "}";
    }//toString

}//Richiesta
