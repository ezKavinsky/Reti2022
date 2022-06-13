package appelli.Luglio2015.WSDL;

import java.util.HashMap;
import java.util.Map;

public class ExamService {
    HashMap<Data, Esame> esami;

    public int votoStudente(String name, Data data, int matricola){
        int voto = -1;
        if(esami.containsKey(data)){
            if(esami.get(data).getName().equals(name)) {
                Esame esame = esami.get(data);
                for (Map.Entry<Integer, Integer> studente : esame.getStudenti().entrySet()) {
                    if (studente.getKey() == matricola)
                        voto = studente.getValue();
                }
            }
        }
        return voto;
    }//votoStudente

    public String esameGiorno(Data data){
        if(esami.containsKey(data))
            return esami.get(data).getName();
        else
            return "Non ci sono esami registrati in quel giorno";
    }//esameGiorno

}//ExamService
