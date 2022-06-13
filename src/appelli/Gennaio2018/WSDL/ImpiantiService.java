package appelli.Gennaio2018.WSDL;

import java.util.HashMap;
import java.util.Map;

public class ImpiantiService {
    private HashMap<Integer, Prodotto> prodotti;


    public void aggiorna(int idImpianto, String idProdotto, int quantita){
        int prodotto = Integer.parseInt(idProdotto);
        if(prodotti.containsKey(prodotto)){
            Prodotto p = prodotti.get(prodotto);
            HashMap<Integer, Integer> scorte = p.getScorte();
            if(scorte.containsKey(idImpianto)){
                scorte.put(idImpianto, scorte.get(idImpianto)+quantita);
            } else{
               scorte.put(idImpianto, quantita);
            }
        } else {
            System.out.println("Prodotto inesistente");
        }
    }//aggiorna

    public Risultato maggioreQuantita(String idProdotto){
        int prodotto = Integer.parseInt(idProdotto);
        Risultato ris = null;
        int impiantoMax = 0;
        int quantitaMax = 0;
        if(prodotti.containsKey(prodotto)){
            Prodotto p = prodotti.get(prodotto);
            for(Map.Entry<Integer, Integer> scorte : p.getScorte().entrySet()){
                if(scorte.getValue() > quantitaMax){
                    impiantoMax = scorte.getKey();
                    quantitaMax = scorte.getValue();
                }
            }
            ris = new Risultato(impiantoMax,quantitaMax);
        } else {
            System.out.println("Prodotto inesistente");
        }
        return ris;
    }//maggioreQuantita


}//ImpiantiService
