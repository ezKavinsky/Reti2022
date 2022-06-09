package esercitazione9.VoliAereoporto_WS;

import java.util.*;

public class Aereoporto implements AereoportoIF{
    private HashMap<Data, HashMap<String, LinkedList<Volo>>> db;

    public Aereoporto() {
        db = new HashMap<Data, HashMap<String, LinkedList<Volo>>>();
    }//constructor

    public String primoVolo(String citta, Data data){
        if(!db.containsKey(data) || !db.get(data).containsKey(citta))
            return "Nessun aereo";
        return db.get(data).get(citta).getFirst().getVoloId();
    }//primoVolo

    public Orario orarioVolo(String voloId, Data data) {
        LinkedList<Volo> tmp;
        if(db.containsKey(data)){
            for(Map.Entry<String, LinkedList<Volo>> entry : db.get(data).entrySet()){
                tmp = entry.getValue();
                for(Volo volo2 : tmp) {
                    if(volo2.getVoloId().equals(voloId))
                        return volo2.getOrario();
                }
            }
        }
        return new Orario(-1, -1);
    }//orarioVolo

}//Aereoporto
