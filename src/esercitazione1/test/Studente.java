package esercitazione1.test;
import java.io.*;

public class Studente implements Serializable {
    private int matricola;
    private String nome, cognome, corsoDiLaurea;

    public Studente(int matricola, String nome, String cognome, String corsoDiLaurea){
        this.matricola=matricola;
        this.nome=nome;
        this.cognome=cognome;
        this.corsoDiLaurea=corsoDiLaurea;
    }//constructor

    public int getMatricola() {
        return matricola;
    }//getMatricola

    public String getNome() {
        return nome;
    }//getNome

    public String getCognome() {
        return cognome;
    }//getCognome

    public String getCorsoDiLaurea() {
        return corsoDiLaurea;
    }//getCorsoDiLaurea

}//Studente
