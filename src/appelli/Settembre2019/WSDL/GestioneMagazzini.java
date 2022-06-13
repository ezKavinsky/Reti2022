package appelli.Settembre2019.WSDL;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GestioneMagazzini {
    private HashMap<Integer, Magazzino> magazzini;

    public Prodotto prodottiService(String produttore){
        HashMap<Integer, Integer> prodotti = new HashMap<>();
        for(Map.Entry<Integer, Magazzino> m : magazzini.entrySet()){
            Magazzino magazzino = m.getValue();
            for(Map.Entry<Integer, Prodotto> p : magazzino.getListaProdotti().entrySet()){
                if(p.getValue().getProduttore().equals(produttore)){
                    if(prodotti.containsKey(p.getValue().getCodice())){
                        prodotti.put(p.getValue().getCodice(), prodotti.get(p.getValue())+1);
                    } else{
                        prodotti.put(p.getValue().getCodice(),1);
                    }
                }
            }
        }
        int codice = 0;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : prodotti.entrySet()){
            if (entry.getValue() > max)
                codice = entry.getKey();
        }
        return trovaProdotto(codice);
    }//prodottiService

    public Prodotto trovaProdotto(int codice){
        for(Map.Entry<Integer, Magazzino> m : magazzini.entrySet()){
            Magazzino magazzino = m.getValue();
            for(Map.Entry<Integer, Prodotto> p : magazzino.getListaProdotti().entrySet()){
                if(p.getValue().getCodice() == codice)
                    return p.getValue();
            }
        }
        return null;
    }//trovaProdotto

    public LinkedList<Prodotto> prodottiMaxIncasso(String id){
        LinkedList<Prodotto> prodotti = new LinkedList<>();
        int ident = Integer.parseInt(id);
        if(!(magazzini.containsKey(ident)))
            return null;
        Magazzino m = magazzini.get(ident);
        HashMap<Integer, Prodotto> listaProdotti = m.getListaProdotti();
        for(int i = 0; i < 3; i++){
            double max = 0;
            for(Map.Entry<Integer, Prodotto> entry : listaProdotti.entrySet()){
                if(entry.getValue().getPrezzo() > max)
                    max = entry.getValue().getPrezzo();
            }

        }
    }//

}////GestioneMagazzini
