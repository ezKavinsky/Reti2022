package appelli.Settembre2019.Clinica;

import java.util.HashMap;

public class Esame {
    private int codice;
    private HashMap<Integer, Integer> medici;

    public Esame(int codice, int mat1, int mat2 ){
        this.codice = codice;
        medici = new HashMap<>();
        medici.put(mat1, 0);
        medici.put(mat2, 0);
    }//Esame

    public int getCodice() {
        return codice;
    }//getCodice

    public HashMap<Integer, Integer> getMedici() {
        return medici;
    }//getMedici

}//Esame
