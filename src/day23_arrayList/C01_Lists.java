package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
       // size boyutu getirir

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(6);
        sayilar.add(5);
        sayilar.add(7);
        System.out.println(sayilar.size());//3
        sayilar.add(6);
        System.out.println(sayilar.size());//4
         List<Integer> sayilar1=new ArrayList<>();
         sayilar1.add(67);
         sayilar1.add(23);
         sayilar.addAll(sayilar1);
        System.out.println(sayilar.size());//6
        System.out.println(sayilar);//[6, 5, 7, 6, 67, 23]

        //set metodu
       //sayilar'in 5. indexini siler yerine 8 yazar
        System.out.println(sayilar.set(5,8));// bize neyi sildigini(23) dondurur
        System.out.println(sayilar);//[6, 5, 7, 6, 67, 8]





    }
}
