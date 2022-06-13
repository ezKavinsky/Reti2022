package appelli.Maggio2020.GestioneAste;
import java.io.Serializable;
import java.util.Date;

public class Prodotto implements Serializable {
    private int codice;
    private Date durata;
    private int prezzoMinimo;

    public Prodotto(int codice, Date durata, int prezzoMinimo){
        this.codice = codice;
        this.durata = durata;
        this.prezzoMinimo = prezzoMinimo;
    }//constructor

    public int getCodice() {
        return codice;
    }//getCodice

    public Date getDurata() {
        return durata;
    }//getDurata

    public int getPrezzoMinimo() {
        return prezzoMinimo;
    }//getPrezzoMinimo

    public String toString(){
        return "Prodotto[ codice= " + codice +", durata= " + durata + "prezzoMinimo= " + prezzoMinimo + "]";
    }//toString

}//Prodotto
