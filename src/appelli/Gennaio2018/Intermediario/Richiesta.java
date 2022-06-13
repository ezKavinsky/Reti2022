package appelli.Gennaio2018.Intermediario;

import java.io.Serializable;

public class Richiesta implements Serializable {
    int idProdotto;
    int quantita;

    public Richiesta(int idProdotto, int quantita){
        this.idProdotto = idProdotto;
        this.quantita = quantita;
    }//constructor

    public int getIdProdotto() {
        return idProdotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String toString(){
        return "Richiesta <" + idProdotto + ", " + quantita + ">";
    }//toString

}//Richiesta
