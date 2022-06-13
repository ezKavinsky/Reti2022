package appelli.Gennaio2018.WSDL;
import java.io.*;
import java.util.*;

public class Risultato implements Serializable {
    int idImpianto;
    int quantita;

    public Risultato(int idImpianto, int quantita){
        this.idImpianto = idImpianto;
        this.quantita = quantita;
    }//costruttore

    public int getIdImpianto() {
        return idImpianto;
    }

    public void setIdImpianto(int idImpianto) {
        this.idImpianto = idImpianto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String toString(){
         return "Risultato <" + idImpianto + ", " + quantita + ">";
    }

}//Risultato
