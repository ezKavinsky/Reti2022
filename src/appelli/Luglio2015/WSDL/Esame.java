package appelli.Luglio2015.WSDL;

import java.util.HashMap;

public class Esame {
    String name;
    Data data;
    HashMap<Integer, Integer> studenti;

    public Esame(String name, Data data){
        this.name = name;
        this.data = data;
    }//constructor

    public String getName() {
        return name;
    }

    public Data getData() {
        return data;
    }

    public HashMap<Integer, Integer> getStudenti() {
        return studenti;
    }

    public void setStudenti(HashMap<Integer, Integer> studenti) {
        this.studenti = studenti;
    }

}//Esame
