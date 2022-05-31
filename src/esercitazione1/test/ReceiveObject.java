package esercitazione1.test;
import java.net.*;
import java.io.*;

public class ReceiveObject {

    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",3575);
            ObjectInputStream input = new ObjectInputStream(s.getInputStream());
            String beginMessage = (String)input.readObject();
            System.out.println(beginMessage);
            Studente studente = (Studente) input.readObject();
            System.out.print(studente.getMatricola()+ "-");
            System.out.print(studente.getNome()+ " " + studente.getCognome() + "-");
            System.out.print(studente.getCorsoDiLaurea()+ "\n");
            String endMessage = (String)input.readObject();
            System.out.println(endMessage);
            s.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }//main



}
