package esercitazione4.BetServer;
import java.net.InetAddress;

public class Scommessa {
    private int ID_scommessa;
    private int N_cavallo;
    private long puntata;
    private InetAddress scommettitore;
    private static int nextID = 0;

    public Scommessa(int n_cavallo, long punt, InetAddress scommett){
        ID_scommessa = nextID++;
        N_cavallo = n_cavallo;
        puntata = punt;
        scommettitore = scommett;
    }//constructor

    public int getID(){
        return ID_scommessa;
    }//getID

    public long getPuntata() {
        return puntata;
    }//getPuntata

    public InetAddress getScommettitore() {
        return scommettitore;
    }//getScommettitore

    public boolean equals(Object o){
        if(!(o instanceof Scommessa))
            return false;
        Scommessa s =(Scommessa)o;
        return N_cavallo == s.N_cavallo;
    }//equals

}//Scommessa
