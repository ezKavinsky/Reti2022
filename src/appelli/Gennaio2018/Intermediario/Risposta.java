package appelli.Gennaio2018.Intermediario;

import java.io.Serializable;

public class Risposta implements Serializable {
    int idProdotto;
    int quantita;
    double prezzoTotale;
    int idIntermediario;


    public Risposta(int idProdotto, int quantita, double prezzoTotale, int idIntermediario){
        this.idProdotto = idProdotto;
        this.quantita = quantita;
        this.prezzoTotale = prezzoTotale;
        this.idIntermediario = idIntermediario;
    }//constructor

    public int getIdProdotto() {
        return idProdotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    public int getIdIntermediario() {
        return idIntermediario;
    }

    public String toString(){
        return "Risposta <" + idProdotto + ", " + quantita + ", " + prezzoTotale + ", " + idIntermediario +">";
    }//toString

}//Risposta
