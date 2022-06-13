package appelli.Luglio2019.WSDL;

import java.io.Serializable;

public class Informazione implements Serializable{
    String condizione;
    double temperaturaMin;
    double temperaturaMax;

    public Informazione(String condizione, double temperaturaMin, double temperaturaMax){
        this.condizione = condizione;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
    }//constructor

    public String getCondizione() {
        return condizione;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }

    public String toString(){
        return "Ultima informazione[ condizione= " + condizione + ", tempMin= " + temperaturaMin + ", tempMax= " + temperaturaMax + "]";
    }//toString

}//Informazione
