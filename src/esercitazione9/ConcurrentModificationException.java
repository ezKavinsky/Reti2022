package esercitazione9;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationException {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Thread t = new Thread(() -> {
           list.add(1); list.add(2); list.add(3);
           list.add(4); list.add(5); list.add(6);
        });

        Thread t2 = new Thread(() -> {
           iterateOverList(list);
        });

        t.start(); t2.start();
    }//main

    private static void iterateOverList(ArrayList<Integer> list){
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer value = it.next();
            System.out.println("List value: " + value);
            if(value.equals(3))
                list.remove(value);
        }
    }//iterateOverList

}//ConcurrentModificationException
