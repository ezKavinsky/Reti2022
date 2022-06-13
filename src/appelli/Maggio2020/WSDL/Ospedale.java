package appelli.Maggio2020.WSDL;
import java.io.Serializable;

public class Ospedale implements Serializable {
    private String codice;
    private String citta;
    private int pazienti;
    private int postiLetto;

    public Ospedale(String codice, String citta, int pazienti, int postiLetto){
        this.codice = codice;
        this.citta = citta;
        this.pazienti = pazienti;
        this.postiLetto = postiLetto;
    }//constructor

    public String getCodice() {
        return codice;
    }//getCodice

    public String getCitta() {
        return citta;
    }//getCitta

    public int getPazienti() {
        return pazienti;
    }//getPazienti

    public int getPostiLetto() {
        return postiLetto;
    }//getPostiLetto

    public void setPazienti(int pazienti) {
        this.pazienti = pazienti;
    }//setPazienti

    public void setPostiLetto(int postiLetto) {
        this.postiLetto = postiLetto;
    }//setPostiLetto

    public boolean equals(Object o){
        if(!(o instanceof Ospedale))
            return false;
        if(o == this)
            return true;
        Ospedale os = (Ospedale)o;
        return (this.codice == os.codice) && (this.citta == os.citta);
    }//equals

    public int hashCode(){
        return (codice + "-" + citta + "-" + pazienti + "-" + postiLetto).hashCode();
    }//hashCode

    public double getRatio(){
        return this.pazienti/this.postiLetto;
    }//getRatio

}//Ospedale
