package appelli.Settembre2019.WSDL;

import java.io.Serializable;

public class Prodotto implements Serializable {
    private int codice;
    private String nome;
    private String produttore;
    private double prezzo;

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String toString(){
        return "Prodotto[ codice= " + codice + ", nome= " + nome + ", prezzo= " + prezzo + "]";
    }//toString


}//Prodotto
