package esercitazione10.Intermediario;

public class Venditore {
    private String gAddress = "230.0.0.1";
    private static final int gPort = 6789;

    public Venditore(String gAddress){
        this.gAddress = gAddress;
    }//constructor

    public String getAddress(){
        return gAddress;
    }//getAddress

    public void setAddress(String gAddress){
        this.gAddress = gAddress;
    }//setAddress

    public static int getPort(){
        return gPort;
    }//getPort



}//Venditore
