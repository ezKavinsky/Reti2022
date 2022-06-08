package esercitazione9.VoliAereoporto_WS;
import java.io.Serializable;

public class Orario implements Serializable {
    private int ore, minuti;

    public Orario(int ore, int minuti) {
        this.ore = ore;
        this.minuti = minuti;
    }//constructor

    public int getOre() {return ore;}//getOre

    public int getMinuti() {return minuti;}//getMinuti

    public int hashCode() {
        return (ore+"-"+minuti).hashCode();
    }//hashCode

    public boolean equals(Object obj) {
        if(!(obj instanceof Orario))
            return false;
        Orario o = (Orario)obj;
        return (this.ore == o.getOre()) && (this.minuti == o.getMinuti());
    }//equals

    public String toString() {
        return "Orario [ore=" + ore + ", minuti=" + minuti + "]";
    }//toString

}//Orario
