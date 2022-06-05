package esercitazione5.Calcolatore;

public class Calcolatore implements CalcolatoreInterface{

    @Override
    public int add(int x, int y) {
        return x + y;
    }//add

    @Override
    public double divide(int x, int y) {
        return (1.0 * x) / (1.0 * y);
    }//divide

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }//multiply

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }//subtract

}//Calcolatore
