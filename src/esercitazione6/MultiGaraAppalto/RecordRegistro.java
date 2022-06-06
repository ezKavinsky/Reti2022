package esercitazione6.MultiGaraAppalto;
import java.net.*;

public class RecordRegistro {
    Socket enteSocket;
    Offerta miglioreOfferta = null;
    Richiesta richiesta;
    boolean status;

    public RecordRegistro(Socket enteSocket, Richiesta richiesta){
        this.enteSocket = enteSocket;
        this.richiesta = richiesta;
        this.status = true;     //la gara è inizialmente aperta
    }//constructor

    public void setMiglioreOfferta(Offerta miglioreOfferta){
        this.miglioreOfferta = miglioreOfferta;
    }//miglioreOfferta

    public boolean isActive(){
        return status;
    }//isActive

    public void setStatus(boolean status) {
        this.status = status;
    }//setStatus


}//RecordRegistro
