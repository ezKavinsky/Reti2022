package esercitazione6.MultiGaraAppalto;
import java.io.Serializable;

public class Offerta implements Serializable {
    private int idGara;                        //aggiungiamo questo per associare l'offerta alla gara
    private int idPartecipante;
    private int importoRichiesto;

    public Offerta(int idPartecipante, int idGara, int importoRichiesto){
        this.idPartecipante = idPartecipante;
        this.importoRichiesto = importoRichiesto;
        this.idGara = idGara;
    }//Offerta

    public int getIdPartecipante() {
        return idPartecipante;
    }//getIdPartecipante

    public int getIdGara() {
        return idGara;
    }//getIdGara

    public int getImportoRichiesto() {
        return importoRichiesto;
    }//getImportoRichiesto

    @Override
    public String toString(){
        return "Offerta[ idPartecipante= " + idPartecipante + ", idGara= " + idGara +
                ", importoRichiesto= " + importoRichiesto + ']';
    }//toString

}//Offerta
