package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {
        /*ListIterator iterator interfacenin child interfaceder
        ama daha cok methoda sahiptir
         */
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10,20,30]

        Integer temp;//integer objenin childe oldugu icin
        //cast yaptik

        ListIterator Lit1= liste.listIterator();

        while (Lit1.hasNext()){
            temp=(Integer)Lit1.next()+3;//burda cast yaptik
            Lit1.set(temp);


        }
        System.out.println(liste);

    }
}
