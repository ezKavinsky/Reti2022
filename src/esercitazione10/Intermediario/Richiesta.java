package esercitazione10.Intermediario;
import java.io.Serializable;

public class Richiesta implements Serializable {
    int idProdotto;
    int quantita;

    public Richiesta(int idProdotto, int quantita){
        this.idProdotto = idProdotto;
        this.quantita = quantita;
    }//constructor

    public int getIdProdotto() {
        return idProdotto;
    }//getIdProdotto

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }//setIdProdotto

    public int getQuantita() {
        return quantita;
    }//getQuantita

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }//setQuantita

}//Richiesta
