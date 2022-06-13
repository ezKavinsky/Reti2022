package appelli.Giugno2017.WSDL;

import java.util.Date;
import java.util.HashMap;

public class Registro {
    HashMap<String, HashMap<String, Double>> incassi;

    public HashMap<String, HashMap<String, Double>> getIncassi() {
        return incassi;
    }

    public void setIncassi(HashMap<String, HashMap<String, Double>> incassi) {
        this.incassi = incassi;
    }
}//Registro
