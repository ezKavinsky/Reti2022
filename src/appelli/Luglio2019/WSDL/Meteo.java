package appelli.Luglio2019.WSDL;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Meteo {
    HashMap<Stato, LinkedList<Citta>> stati;

    public Informazione meteoCoordinata(Coordinate c){
       for(Map.Entry<Stato, LinkedList<Citta>> stato : stati.entrySet()){
           LinkedList<Citta> lista = stato.getValue();
           for(Citta citta : lista){
               if(citta.getCoordinate().equals(c)){
                   return citta.getInformazione();
               }
           }
       }
       return null;
    }//meteoCoordinata

    public String maxMinTemperatura(String stato){
        String citta = "";
        for(Map.Entry<Stato, LinkedList<Citta>> entry : stati.entrySet()){
            if(entry.getKey().getNome().equals(stato)){
                double diff = 0;
                for(Citta c : entry.getValue()){
                    Informazione inf = c.getInformazione();
                    if(inf.getTemperaturaMax()-inf.getTemperaturaMin() > diff)
                        citta = c.getNome();
                }
            }
        }
        return citta;
    }//maxMinTemperatura

}//Meteo
