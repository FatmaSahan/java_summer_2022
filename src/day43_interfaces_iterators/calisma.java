package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class calisma {
    public static void main(String[] args) {


        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);
       ListIterator Lit= liste.listIterator();
       while (Lit.hasNext()){
           Integer temp=(Integer)Lit.next()+3;
           Lit.set(temp);


       }
        System.out.println(liste);
    }}