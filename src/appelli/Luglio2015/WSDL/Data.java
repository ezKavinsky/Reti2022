package appelli.Luglio2015.WSDL;
import java.io.Serializable;

public class Data implements Serializable {
    int giorno;
    int mese;
    int anno;

    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }//constructor

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

}//Data
