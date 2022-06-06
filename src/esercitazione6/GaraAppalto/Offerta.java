package esercitazione6.GaraAppalto;

import java.io.Serializable;

public class Offerta implements Serializable {
    private int id;
    private int importoRichiesto;

    public Offerta(int id, int importoRichiesto){
        this.id = id;
        this.importoRichiesto = importoRichiesto;
    }//Offerta

    public int getId() {
        return id;
    }//getId

    public int getImportoRichiesto() {
        return importoRichiesto;
    }//getImportoRichiesto

    @Override
    public String toString(){
        return "Offerta{ id= " + id + ", importoRichiesto= " + importoRichiesto + '}';
    }//toString

}//Offerta
