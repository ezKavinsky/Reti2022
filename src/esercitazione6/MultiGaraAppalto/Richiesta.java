package esercitazione6.MultiGaraAppalto;
import java.io.Serializable;

public class Richiesta implements Serializable {
    private int idEnte;
    private String descrizione;
    private int importoMassimo;

    public Richiesta(int idEnte, String descrizione, int importoMassimo){
        this.idEnte = idEnte;
        this.descrizione = descrizione;
        this.importoMassimo = importoMassimo;
    }//constructor

    public int getIdEnte() {
        return idEnte;
    }//getIdEnte

    public String getDescrizione() {
        return descrizione;
    }//getDescrizione

    public int getImportoMassimo() {
        return importoMassimo;
    }//getImportMassimo

    @Override
    public String toString(){
        return "Richiesta[ idEnte= " + idEnte + ", descrizione= '" + descrizione + "',\n importoMassimo= " + importoMassimo + "]";
    }//toString

}//Richiesta
