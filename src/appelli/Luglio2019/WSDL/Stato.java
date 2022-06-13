package appelli.Luglio2019.WSDL;

import java.util.LinkedList;

public class Stato {
    String nome;
    LinkedList<Citta> listaCitta;

    public Stato(String nome, LinkedList<Citta> listaCitta){
        this.nome = nome;
        this.listaCitta = listaCitta;
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Citta> getListaCitta() {
        return listaCitta;
    }

}//Stato
