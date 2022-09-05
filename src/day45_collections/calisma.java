package day45_collections;

import java.util.*;

public class calisma {
    public static void main(String[] args) {
        //Verilen bir array'deki tekrar eden elementleri silip
// tekrarsiz halini Array'e atayan bir kod yaziniz.
        int[] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsizSet=new HashSet<>();
        for (Integer each:arr
             ) {tekrarsizSet.add(each);

            
        }

        System.out.println(tekrarsizSet);
        int [] tekrarsizArr=new int[tekrarsizSet.size()];
        int i=0;
        for (Integer each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;

        }
        System.out.println(Arrays.toString(tekrarsizArr));
        List<Object> list=new ArrayList<>();
        list.add(5);
        list.add("fatos");
        list.add('f');
        list.add(true);
        list.add("5");

        System.out.println(list);
        list.set(0,(Integer)list.get(0)+6);
        list.set(1,list.get(1)+"sahan");
        System.out.println(list);
        Set<Object> set=new HashSet<>();
        set.add(5);
        set.add("5");
        set.add("fatma");
        set.add(5);
        System.out.println(set);
        
        
        
    }
}
