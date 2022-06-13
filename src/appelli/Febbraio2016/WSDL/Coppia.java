package appelli.Febbraio2016.WSDL;

import java.io.Serializable;

public class Coppia implements Serializable {
    String idNegozio;
    int quantita;

    public Coppia(String idNegozio, int quantita){
        this.idNegozio = idNegozio;
        this.quantita = quantita;
    }//constructor

    public String getIdNegozio() {
        return idNegozio;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

}//Coppia
