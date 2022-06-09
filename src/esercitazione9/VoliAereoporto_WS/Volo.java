package esercitazione9.VoliAereoporto_WS;

public class Volo{
    private String citta;
    private Data data;
    private Orario orario;
    private String voloId;

    public Volo(String citta, Data data, Orario orario, String voloId) {
        super();
        this.citta = citta;
        this.data = data;
        this.orario = orario;
        this.voloId = voloId;
    }//constructor

    public String getCitta() {
        return citta;
    }//getCitta

    public Data getData() {
        return data;
    }//getData

    public Orario getOrario() {
        return orario;
    }//getOrario

    public String getVoloId() {
        return voloId;
    }//getVoloId

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Volo))
            return false;
        if(this==obj)
            return true;
        Volo v = (Volo)obj;
        return this.voloId == v.voloId;
    }

    @Override
    public int hashCode() {
        return (citta + "-" + data + "-" + orario + "-" + voloId).hashCode();
    }//hashCode

}//hashCode
