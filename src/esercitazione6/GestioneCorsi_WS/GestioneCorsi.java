package esercitazione6.GestioneCorsi_WS;

import java.util.HashMap;

public class GestioneCorsi {
    HashMap<String,Corso> corsi = new HashMap<>();

    public void aggiungiCorso(Corso c){
        String nome = c.nomeCorso;
        corsi.put(nome,c);
    }//aggiungiCorso

    public Corso getCorso(String nome){
        Corso c = null;
        if(corsi.containsKey(nome))
            c = corsi.get(nome);
        return c;
    }//getCorso

}//GestioneCorsi
