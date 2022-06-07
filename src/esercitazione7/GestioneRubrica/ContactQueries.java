package esercitazione7.GestioneRubrica;
/*
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class ContactQueries {
    String dbFileLocation;
    File db;
    Map<Long,Contact> contatti = new HashMap<>();

    public ContactQueries(){
        dbFileLocation = "databaseContatti.json";
        db = new File(dbFileLocation);
        try{
            if(db.createNewFile()){
                System.out.println("Database has been created.");
            } else {
                Files.lines(Paths.get(dbFileLocation)).map(line -> new Contact(line)).forEach(c -> contatti.put(c.getId(), c));
                System.out.println("Database file has been loaded.");
            }
        }catch(IOException ioe){ ioe.printStackTrace();}
    }//constructor

    public void insertOrUpdate(Contact c){
        contatti.put(c.getId(), c);
        flushDB();
    }//insertOrUpdate

    public Contact select(long id){
        return contatti.get(id);
    }//select

    public void delete(long id){
        contatti.remove(id);
        flushDB();
    }//delete

    public Collection<Contact> getAll(){
        return contatti.values();
    }//getAll

    public Collection<Contact> getByName(String name){
        final String text = name.toLowerCase();
        return this.contatti.values().stream().filter(c -> c.getName().toLowerCase().contains(text) || c.getSurname().contains(text).collect(Collectors.toList()));
    }//getByName

    private void flushDB(){
        try {
            db = new File(dbFileLocation);
            List<String> dati = this.contatti.values().stream().map(Contact::toString).collect(Collectors.toList());
            Files.write(Paths.get(dbFileLocation), dati);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//flushDB

}//ContactQueries
*/