package appelli.Maggio2020.WSDL;
import java.util.HashMap;
import java.util.Map;

public class AndamentoPazienti {
    private HashMap<Integer, Ospedale> ospedali;

    public AndamentoPazienti(){
        ospedali = new HashMap<Integer, Ospedale>();
    }//constructor

    public Ospedale maxOspedale(String citta){
        Ospedale max = null;
        for(Map.Entry<Integer, Ospedale> entry : ospedali.entrySet()){
            if(entry.getValue().getCitta().equals(citta)){
                if(max.getPostiLetto() <= entry.getValue().getPostiLetto())
                    max = entry.getValue();
            }
        }
        return max;
    }//maxOspedale

    public String cittaRatio(){
        String citta = "";
        double tasso = 0;
        for(Map.Entry<Integer, Ospedale> entry : ospedali.entrySet()){
            double entryR = entry.getValue().getRatio();
            if(tasso < entryR){
                tasso = entryR;
                citta = entry.getValue().getCitta();
            }
        }
        return citta;
    }//cittaRatio

}//AndamentoPazienti
