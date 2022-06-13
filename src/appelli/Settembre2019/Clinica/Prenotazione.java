package appelli.Settembre2019.Clinica;

import java.io.Serializable;

public class Prenotazione implements Serializable {
    private int codice;
    private int numProg;
    private int matr;

    public Prenotazione(int codice, int numProg, int matr){
        this.codice = codice;
        this.numProg = numProg;
        this.matr = matr;
    }//Prenotazione

    public int getCodice() {
        return codice;
    }//getCodice

    public int getNumProg() {
        return numProg;
    }//getNumProg

    public int getMatr() {
        return matr;
    }//getMatr

    public String toString(){
        return "Prenotazione[ codice= " + codice + ", num= " + numProg + ", medico= " + matr;
    }//toString

}//Prenotazione
