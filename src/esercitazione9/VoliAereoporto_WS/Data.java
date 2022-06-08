package esercitazione9.VoliAereoporto_WS;

import java.io.Serializable;

public class Data implements Serializable {
    private int giorno, mese, anno;

    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }//constructor

    public int getGiorno() {return giorno;}//getGiorno

    public int getMese() {return mese;}//getMese

    public int getAnno() {return anno;}//getAnno

    public int hashCode() {
        return (anno+"-"+mese+"-"+anno).hashCode();
    }//hashCode

    public boolean equals(Object obj) {
        if(!(obj instanceof Data))
            return false;
        Data d = (Data)obj;
        return (this.anno == d.getAnno()) && (this.mese == d.getMese()) && (this.giorno == d.getGiorno());
    }//equals

    public String toString() {
        return "Data [giorno=" + giorno + ", mese=" + mese + ", anno=" + anno + "]";
    }//toString

}//Data