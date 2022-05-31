package esercitazione1.metodi;

import java.net.InetAddress;
import java.net.Socket;

public class MetodiSocket {

    /*

    Socket s = new Socket(String host,int port); crea un socket e lo connette all'host ed alla porta specificati, host è un hostname
                                                 oppure un indirizzo IP

    Socket s = new Socket(InetAddress address, int port); crea un socket e lo connette all'indirizzo IP ed alla porta specificati

    void close(); chiude il socket

    InetAddress getInetAddress(); restituisce l'indirizzo IP a cui è connesso il socket

    int getPort(); restituisce la porta remota a cui è connesso il socket

    int getLocalPort(); restituisce la porta locale del socket

    InputStream getInputStream(); restituisce lo stream di input del socket, questo stream è utilizzato per leggere i dati provenienti
                                  dal socket

    OutputStream getOutputStream(); restituisce lo stream di output del socket, questo stream è utilizzato per scrivere i dati nel socket

    void setSoTimeout(int timeout); imposta il timeout per operazioni di lettura dal socket; se il tempo specificato trascorre genera una
                                    InterruptedIOException

    String toString(); restituisce una rappresentazione del socket del tipo "Socket[addr=hostname/192.168.90.82,port=3575,localport=1026]"

    */
}//MetodiSocket
