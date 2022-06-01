package esercitazione1.test;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ReceiveObjectAdv {

    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",3575);
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(s.getInputStream());
            Scanner sc = new Scanner(System.in);
            for(int i=0; i<2; i++) {
                String beginMessage = (String) input.readObject();
                System.out.println(beginMessage);
            }
            out.writeObject(sc.nextLine());
            String responseMessage = (String)input.readObject();
            System.out.println(responseMessage);
            if(responseMessage.equals("<Student found>")) {
                Studente studente = (Studente) input.readObject();
                System.out.print(studente.getMatricola() + "-");
                System.out.print(studente.getNome() + " " + studente.getCognome() + "-");
                System.out.print(studente.getCorsoDiLaurea() + "\n");
            }
            String endMessage = (String)input.readObject();
            System.out.println(endMessage);
            s.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }//main



}
