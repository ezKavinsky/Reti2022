package esercitazione9.IndexServer;
import java.io.Serializable;
import java.util.Arrays;

public class File implements Serializable {
    private String filename;
    private String[] keywords;
    private String contenuto;

    public File(String filename, String[] keywords, String contenuto){
        super();
        this.filename = filename;
        this.keywords = keywords;
        this.contenuto = contenuto;
    }//constructor

    public String getFilename() {
        return filename;
    }//getFilename

    public String[] getKeywords() {
        return keywords;
    }//getKeywords

    public String getContenuto() {
        return contenuto;
    }//getContenuto

    @Override
    public String toString(){
        return "File [filename= " + filename + ", keywords= " + Arrays.toString(keywords) + ", contenuto= " + contenuto +"]";
    }//toString

}//File