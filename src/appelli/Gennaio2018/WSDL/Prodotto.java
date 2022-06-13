package appelli.Gennaio2018.WSDL;

import java.util.HashMap;

public class Prodotto {
    int idProdotto;
    HashMap<Integer, Integer> scorte;

    public Prodotto(int idProdotto){
        this.idProdotto = idProdotto;
        scorte = new HashMap<>();
    }//costruttore

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public HashMap<Integer, Integer> getScorte() {
        return scorte;
    }

    public void setScorte(HashMap<Integer, Integer> scorte) {
        this.scorte = scorte;
    }
}//Prodotto
