package esercitazione5.Esempio1;

//Classe che implementa il servizio
public class Esempio1 {

    //Metodo che implementa il servizio. Questo servizio restituisce una stringa di saluto
    public String saluto(){
        return "Ciao Mondo";
    }//saluto

    //Metodo che implementa il servizio. Riceve un parametro. Questo servizio restituisce una stringa di saluto col nome della persona
    public String salutoWithName(String name){
        return "Ciao " + name + "!";
    }//salutoWithName

}//Esempio1
