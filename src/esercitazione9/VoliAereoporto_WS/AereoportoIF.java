package esercitazione9.VoliAereoporto_WS;

public interface AereoportoIF {

    public String primoVolo(String citta, Data data);
    public Orario orarioVolo(String voloId, Data data);

}//AereoportoIF
