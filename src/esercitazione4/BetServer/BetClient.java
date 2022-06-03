package esercitazione4.BetServer;
import java.io.*;
import java.net.*;
import java.util.*;

public class BetClient {
    private int serverPort;
    private int myPort;
    private InetAddress groupAddress;
    private InetAddress serverAddress;
    private Socket s;

    public BetClient(InetAddress gAddress, InetAddress server, int sPort, int mPort){
        groupAddress = gAddress;
        serverAddress = server;
        serverPort = sPort;
        myPort = mPort;
        try{
            s = new Socket(serverAddress,serverPort);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }//constructor

    public boolean placeBet(int nCavallo, long puntata){
        String e = "";
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            String bet = nCavallo + " " + puntata;
            out.println(bet);       //invia la scommessa
            e = in.readLine();      //riceve un msg di risposta, che indica se la scommessa è stata accettata oppure rifiutata (per esempio, se è arrivata oltre il tempo limite)
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        return e.equals("Scommessa accettata.");
    }//placeBet


    public void riceviElencoVincitori(){
        try{
            MulticastSocket socket = new MulticastSocket(myPort);
            socket.joinGroup(groupAddress);
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String elenco = new String(packet.getData());
            System.out.println("Elenco vincitori: ");
            System.out.println(elenco);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }//riceviElencoVincitori

    public static void main(String[] args){
        int serverPort = 8001;
        int myPort = 8002;
        try{
            InetAddress group = InetAddress.getByName("230.0.0.1");
            InetAddress server = InetAddress.getByName("127.0.0.1");
            BetClient client = new BetClient(group, server, serverPort, myPort);
            int cavallo = ((int)(Math.random()*12))+1;      //cavallo su cui scommette, tra 1 e 12
            int cifra = ((int)(Math.random()*100))+1;       //cifra su cui scommette, tra 1 e 100 euro
            if(client.placeBet(cavallo,cifra))
                client.riceviElencoVincitori();
        }catch(UnknownHostException uhe){
            System.out.println(uhe);
        }
    }//main
}//BetClient
