package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Contains {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println(urunler.contains("Nutella")); // true//URUNLER NUTELLA ICERIYORMU
        System.out.println(urunler.contains("Hobby")); // false

        List<String> urunler2= new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");
        System.out.println(urunler.containsAll(urunler2)); // true// "CONTAINSALL"   URUNLER URUNLER2 NIN HEPSINI ICERIYORMU
        urunler2.add("Hobby");
        System.out.println(urunler.containsAll(urunler2)); // false



    }
}
