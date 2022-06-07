package esercitazione6.GestioneCorsi_WS;
import java.io.Serializable;

public class Corso implements Serializable {
    String nomeCorso;
    String programma;
    int numeroCrediti;
    String docente;
    int oreLezione;
    int oreEsercitazione;

    public Corso(String nomeCorso, String programma, int numeroCrediti, String docente, int oreLezione, int oreEsercitazione) {
        this.nomeCorso = nomeCorso;
        this.programma = programma;
        this.numeroCrediti = numeroCrediti;
        this.docente = docente;
        this.oreLezione = oreLezione;
        this.oreEsercitazione = oreEsercitazione;
    }//constructor

    public Corso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }//constructor

    public String toString(){
        String s = nomeCorso + "," + numeroCrediti + "CFU";
        return s;
    }//toString

}//Corso
