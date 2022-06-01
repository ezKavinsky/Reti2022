package esercitazione1.test;
import java.net.*;
import java.util.HashMap;
import java.io.*;

public class SendObjectAdv {

    public static void main(String[] args){
        HashMap<Integer,Studente> studenti = new HashMap<>();
        studenti.put(14520,new Studente(14520,"Leonardo","da Vinci","Ingegneria Informatica"));
        studenti.put(13290,new Studente(13290,"Patrick","Bateman","Ingegneria Informatica"));
        try{
            ServerSocket server = new ServerSocket(3575);
            Socket client = server.accept();
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            out.writeObject("<Welcome>");
            out.writeObject("<Enter a badge number to start>");
            int mat = Integer.parseInt((String)in.readObject());
            if(studenti.containsKey(mat)){
                Studente studente = studenti.get(mat);
                out.writeObject("<Student found>");
                out.writeObject(studente);
            }
            else
                out.writeObject("<Student not found>");
            out.writeObject("<Goodbye>");
            client.close();
            server.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//main
}//SendObjectAdv
