package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections<dataTuru> nu Object seçmeniz durumunda Collection'a farkli data turlerinden objeler koymaniza izin
        verir. Bu depolama acisindan bize esneklik saglar, ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir.
        */


        List<String> liste = new ArrayList();
        //liste.add(5);
       // liste.add('s');
        //iste.add(true);

        List<Object> list = new ArrayList();
        list.add(5);
         list.add('s');
        list.add(true);
        list.add("fatma");
        System.out.println(list);//[5, s, true, fatma]

        list.set(0,(Integer)list.get(0)+5);//[10, s, true, fatma]
        System.out.println(list);

        list.set(3,list.get(3)+"can");//[10, s, true, fatmacan]
        System.out.println(list);
      //  list.set(2,!())

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
        System.out.println(set1);//[5, 5, true]




    }
}