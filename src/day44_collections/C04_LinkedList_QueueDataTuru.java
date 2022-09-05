package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");
        //queue kuyruk demektir
        //sira onemlidir
        //gelen son a gelir
        //giden bastan gider
        System.out.println(ll3);
        System.out.println( ll3.remove());//ademi siler
        System.out.println(ll3);
        System.out.println(ll3.remove("Hpolat"));//true
        System.out.println(ll3);
        System.out.println( ll3.element());//zeynep
        System.out.println(ll3.peek());//zeynep

        ll3.offer("Ahmet");//listeye add gibi sondan ekler

        ll3.offer("sefa");
        System.out.println(ll3);


        Queue<String> ll4=new LinkedList();//[]

       // System.out.println(ll4.element());//throws excepcion
        System.out.println(ll4.peek());//null
        //peekve element bize ik elemani dondurur
        //aralarindaki fark ise liste bos olursa element excepcion verri peek ise nulldondurur

        System.out.println(ll3.poll());//ilk elemani siler
        System.out.println(ll3);
        System.out.println(ll4.poll());//bossa null doner
    }
}
