package esercitazione6.MultiGaraAppalto;
import java.util.*;
import java.net.*;

public class RegistroGare {
    private static int COUNTER = 0;
    HashMap<Integer, RecordRegistro> gare = new HashMap<>();

    public Richiesta getRichiesta(int idGara){
        return this.gare.get(idGara).richiesta;
    }//getRichiesta

    public Offerta getOffertaVincente(int idGara){
        return this.gare.get(idGara).miglioreOfferta;
    }//getOffertaVincente

    public Socket getSocketEnte(int idGara){
        return this.gare.get(idGara).enteSocket ;
    }//getSocketEnte

    public synchronized int addGara(Socket enteSocket, Richiesta richiesta){
        int idGara = COUNTER++;
        this.gare.put(idGara, new RecordRegistro(enteSocket, richiesta));
        return idGara;
    }//addGara

    public synchronized void chiudiGara(int idGara){
        if(this.gare.containsKey(idGara)){
            this.gare.get(idGara).setStatus(false);
        }
    }//chiudiGara

    public synchronized void aggiungiOfferta(Offerta offerta){
        int idGara = offerta.getIdGara();
        if(this.gare.containsKey(idGara)){
            RecordRegistro gara = this.gare.get(idGara);
            if(gara.isActive()){
                Offerta oVincente = gara.miglioreOfferta;
                if((oVincente == null && offerta.getImportoRichiesto() <= gara.richiesta.getImportoMassimo()) ||
                    oVincente.getImportoRichiesto() > offerta.getImportoRichiesto() ||
                        (oVincente.getImportoRichiesto() == offerta.getImportoRichiesto() &&
                                offerta.getIdPartecipante() < oVincente.getIdPartecipante())){
                    gara.setMiglioreOfferta(offerta);
                    System.out.println("Aggiunta offerta per gara " + idGara);
                } else {
                    System.out.println("Rifiutata offerta fuori tempo per gara " + idGara);
                }
            }
        }
    }//aggiungiOfferta

}