package appelli.Luglio2019.WSDL;

import java.io.Serializable;

public class Coordinate implements Serializable {
    double latitudine;
    double longitudine;

    public Coordinate(double latitudine, double longitudine){
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }//constructor

    public double getLatitudine() {
        return latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

}//Coordinate
