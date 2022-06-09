package esercitazione9.VoliAereoporto_Rest;
import esercitazione9.VoliAereoporto_WS.*;
import java.util.*;
/*
@Path("/")
public class Aereoporto implements AereoportoIF {
    private HashMap<Data, HashMap<String, LinkedList<Volo>>> db;

    public Aereoporto(){
        db = new HashMap<Data, HashMap<String, LinkedList<Volo>>>();
    }//constructor

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String primoVolo(@QueryParam("citta") String citta, @QueryParam("data") String data){
        if(!db.containsKey(data) || !db.get(data).containsKey(citta))
            return "Nessun volo";
        return db.get(data).get(citta).getFirst().getVoloId();
    }//primoVolo

    public Orario orarioVolo(String voloId, Data data){
        LinkedList<Volo> tmp;
        if(db.containsKey(data)){
            for(Map.Entry<String, LinkedList<Volo>> entry : db.get(data).entrySet()){
                tmp = entry.getValue();
                for(Volo volo2 : tmp){
                    if(volo2.getVoloId().equals(voloId))
                        return volo2.getOrario();
                }
            }
        }
        return new Orario(-1,-1);
    }//orarioVolo

}//Aereoporto
*/