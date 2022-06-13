package appelli.Maggio2020.GestioneAste;
import java.io.Serializable;

public class Offerta implements Serializable {
    private Prodotto prodotto;
    private Cliente cliente;
    private int cifra;

    public Offerta(Prodotto prodotto, Cliente cliente, int cifra){
        this.prodotto = prodotto;
        this.cliente = cliente;
        this.cifra = cifra;
    }//constructor

    public Prodotto getProdotto() {
        return prodotto;
    }//getProdotto

    public Cliente getCliente() {
        return cliente;
    }//getCliente

    public int getCifra() {
        return cifra;
    }//getCifra

    public String toString(){
        return "Offerta[ prodotto= " + prodotto + ",\ncliente= " + cliente + ", cifra= " + cifra + "]";
    }//toString

}//Offerta
