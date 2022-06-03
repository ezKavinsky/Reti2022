package esercitazione3.metodi;

public class MetodiURLeURLConnection {

    /*
        URL(String spec);  //crea un oggetto URL a partire dalla stringa che lo rappresenta

        URL(String protocol, String host, int port, String file);  //crea un URL a partire dai componenti specificati (port = -1 indica l'uso della porta standard per il protocollo specificato)

        URLConnection openConnection();  //restituisce un oggetto URLConnection che gestisce la connessione diretta alla risorsa

        InputStream openStream();  //apre un flusso di input per la lettura dei dati dalla risorsa

        String query();  //restituisce la query string di un URL

        String getRef();  //restituisce la reference (o anchor) di un URL

        String getHost();  //restituisce l'hostname di un URL

        String getPort();  //restituisce la porta di un URL

        String getProtocol();  //restituisce il protocollo di un URL

        String getUserInfo();  //restituisce la parte di informazioni utente di un URL

        <protocol>://<userinfo>@<hostname>:<port>/<path>?<query>#<references>

        URLConnection connection = url.openConnection();
        connection.connect();

        void setDoInput(boolean doInput);  //se doInput è true, l'utente può ricevere l'input da questo URLConnection

        void setDoOutput(boolean doOutput);  //se doOutput è true, l'utente può ricevere l'output da questo URLConnection

        void setModifiedSince(long time);  //configura questo URLConnection per recuperare solo i dati che sono stati modificati dopo la data indicata

        void setUseCaches(boolean useCaches);  //se useCaches è true, i dati possono essere recuperati da una cache locale

        void setAllowUserInteraction(boolean allowUserInteraction);  //se allowUserInteraction è true, all'utente può essere richiesto un input addizionale (es. una password)

        void setRequestProperty(String key, String value);  //imposta una proprietà della richiesta

        void connect();  //si connette alla risorsa remota e recupera le informazioni di intestazione

        String getContentType();  //recupera il tipo di contenuto, per esempio text/plain o image/gif

        int getContentLength();  //recupera la lunghezza del contenuto, oppure -1 se il valore è sconosciuto

        String getContentEncoding();  //recupera la codifica del contenuto, per esempio gzip

        long getDate();  //recupera la data di creazione della risorsa

        long getExpiration();  //recupera la data di scadenza della risorsa

        long getLastModified();  //recupera la data dell'ultima modifica della risorsa

        String getHeaderFieldKey(int n);  //recupera l'n-esima chiave del campo di intestazione

        String getHeaderField(int n);  //recupera l'n-esimo valore del campo di intestazione

        InputStream getInputStream();  //restituisce uno stream per leggere dalla risorsa

        OutputStream getOutputStream();  //restituisce uno stream per scrivere sulla risorsa

     */

}
