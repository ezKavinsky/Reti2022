package appelli.BetServer;
import java.io.*;
import java.net.*;
import java.util.*;

public class BetClient {
    private int myPort;
    private int sPort;
    private InetAddress gAddress;
    private InetAddress sAddress;
    private Socket s;

    public BetClient(int myPort, int sPort, InetAddress gAddress, InetAddress sAddress){
        this.myPort = myPort;
        this.sPort = sPort;
        this.gAddress = gAddress;
        this.sAddress = sAddress;
        try{
            s = new Socket(sAddress, sPort);
            System.out.println(s);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//constructor

    public boolean placeBet(int nCavallo, long puntata){
        String e = "";
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream());
            //Invio la scommessa
            String bet = nCavallo + " " + puntata;
            out.println(bet);
            //Attendo la risposta dal server
            e = in.readLine();
        }catch(IOException ioe){ ioe.printStackTrace(); }
        return e.equals("Scommessa accettata");
    }//placeBet

    public void riceviElencoVincitori(){
        try{
            MulticastSocket socket = new MulticastSocket(myPort);
            socket.joinGroup(gAddress);
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String elenco = new String(packet.getData());
            System.out.print("Elenco vincitori: ");
            System.out.println(elenco);
        }catch(IOException ioe){ioe.printStackTrace();}
    }//riceviElencoVincitori

    public static void main(String[] args){
        int serverPort = 8001;
        int myPort = 8002;
        try{
            InetAddress group = InetAddress.getByName("230.0.0.1");
            InetAddress server = InetAddress.getByName("127.0.0.1");
            BetClient client = new BetClient(myPort,serverPort,group,server);
            int cavallo = ((int)Math.random()*12)+1;
            int cifra = ((int)Math.random()*100)+1;
            if(client.placeBet(cavallo,cifra))
                client.riceviElencoVincitori();
        }catch(UnknownHostException uhe){uhe.printStackTrace();}
    }

}//BetClient
