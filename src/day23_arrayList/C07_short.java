package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_short {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        Collections.sort(urunler);//collections yazinca kutuphaneden kitap ali gibi kitap gelir ve siralam yapariz
        System.out.println(urunler); // [Cay, Cekirdek, Ikram, Nutella]
        /*
         List ile gelen sort method'unda siralama ozelligini girmek gerekiyor
         bunun yerine "COLLECTIONS "class'indan "SORT" method'unu kullaniyoruz
         bu method listemizi natural order'a gore siralar
         */



    }
}
