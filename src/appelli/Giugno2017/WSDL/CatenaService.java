package appelli.Giugno2017.WSDL;
import java.util.HashMap;
import java.util.Map;

public class CatenaService {
    HashMap<String, Albergo> alberghi;
    Registro registro = new Registro();

    public void setGuadagni(double cifra, String citta){
        if(alberghi.containsKey(citta)){
            if(registro.incassi.containsKey(citta)){
                registro.incassi.get(citta).put(getCurrentDay(), cifra);
            } else {
                registro.incassi.put(citta, new HashMap<>().put(getCurrentDay(),cifra));
            }
        }
        else
            System.out.println("Albergo inesistente");
    }//setGuadagni

    public String maxGuadagno(){
        String date = getCurrentDay();
        String citta = "";
        double maxDiff = 0;
        for(Map.Entry<String, HashMap<String, Double>> entry : registro.getIncassi().entrySet()){
            double oggi = entry.getValue().get(date);
            double ieri = entry.getValue().get(getPreviousDay(date));
            if((oggi - ieri) > maxDiff){
                citta = entry.getKey();
            }
        }
        return citta;
    }

}//CatenaService
