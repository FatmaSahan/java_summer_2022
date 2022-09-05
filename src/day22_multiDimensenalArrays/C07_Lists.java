package day22_multiDimensenalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        //List primitive data turlerini kabul etmez(ornegin int i kabul etmez)
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);//[5,3,7]
        //sadece add yaparsak java sona ekler
        //asgidaki ise addALL metodu istedgmiz indexe elemani ekleriz.eklendikten sonra sagdakielemani kaydirir yani silmez

        sayilar.add(2,10);
        sayilar.add(4,76);
        sayilar.add(3,23);
        //indexi 2 olan yere 10 elementini ekle
        System.out.println(sayilar);//[5,3,10,7]
        //add(index,element) istedigimiz indexe istedigimiz elemnti yerlestirir
        //add metodu  eski elementleri silmez yada update etmez yeni element ekler


    }
}
