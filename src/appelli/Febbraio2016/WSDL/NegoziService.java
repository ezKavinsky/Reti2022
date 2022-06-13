package appelli.Febbraio2016.WSDL;

import java.util.HashMap;
import java.util.Map;

public class NegoziService {
    HashMap<Coppia, Negozio> negozi;


    public void aggiorna(String idNegozio, String idProdotto, int quantita){
        int id = Integer.parseInt(idProdotto);
        for(Map.Entry<Coppia,Negozio> entry : negozi.entrySet()){
            if(entry.getKey().getIdNegozio().equals(idNegozio) && entry.getValue().getProdotti().containsKey(id)){
                Prodotto p = entry.getValue().getProdotti().get(id);
                entry.getValue().getProdotti().put(p.getId(),)
            }
        }
    }





}
