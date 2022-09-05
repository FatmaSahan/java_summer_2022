package day23_arrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> urunler2= new ArrayList<>();
        urunler2.add("Cekirdek");
        urunler2.add("Cay");
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        System.out.println( urunler.equals(urunler2));
        //false doner cunku siralama ayni degil
        //ayrica equals buyuk kucuk harfe duyrlidir
        Collections.sort(urunler);
        System.out.println(urunler);

        Collections.sort(urunler2);
        System.out.println(urunler2);

        System.out.println(urunler.equals(urunler2));//true


            }
        }







