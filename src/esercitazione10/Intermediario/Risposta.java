package esercitazione10.Intermediario;
import java.io.Serializable;

public class Risposta implements Serializable {
    private int prezzo;
    private int quantita;
    private int idVenditore;
    private int idProdotto;

    public Risposta(int idProdotto, int quantita, int prezzo, int idVenditore){
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.idProdotto = idProdotto;
        this.idVenditore = idVenditore;
    }//Risposta

    public int getPrezzo() {
        return prezzo;
    }//getPrezzo

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }//setPrezzo

    public int getQuantita() {
        return quantita;
    }//getQuantita

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }//setQuantita

    public int getIdVenditore() {
        return idVenditore;
    }//getIdVenditore

    public void setIdVenditore(int idVenditore) {
        this.idVenditore = idVenditore;
    }//setIdVenditore

    public int getIdProdotto() {
        return idProdotto;
    }//getIdProdotto

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }//setIdProdotto

}//Risposta
