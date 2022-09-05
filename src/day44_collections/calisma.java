package day44_collections;

import java.util.*;

public class calisma {
    public static void main(String[] args) {
       // linklistin parente list ve queue dir
        List<String> ll=new LinkedList<>();
        Queue<String> LL1=new LinkedList<>();
        Deque<String> LL2=new LinkedList<>();
        LinkedList<String> ll3=new LinkedList<>();
        LL1.add("adem");
        LL1.add("fatma");
        LL1.add("senih");
        LL1.add("melih");
        LL1.add("sadet");
        System.out.println(LL1);
        LL1.remove();
        System.out.println(LL1);

        LL1.remove("fatma");
        System.out.println(LL1);
        System.out.println(LL1.element());
        System.out.println(LL1.peek());


        }


    }