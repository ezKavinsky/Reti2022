package appelli.Luglio2019.WSDL;

public class Citta {
    String nome;
    Coordinate coordinate;
    Informazione informazione;

    public Citta(String nome, Coordinate coordinate, Informazione informazione){
        this.nome = nome;
        this.coordinate = coordinate;
        this.informazione = informazione;
    }

    public Informazione getInformazione() {
        return informazione;
    }

    public void setInformazione(Informazione informazione) {
        this.informazione = informazione;
    }

    public String getNome() {
        return nome;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

}//Citta
