package day14_methodCreation;

import java.util.Scanner;

import static day14_methodCreation.C03_MethodCreation.isimGizle;

public class C04_MethodCreanitionReturn {
    public static void main(String[] args) {
        //verilen isim ve soyisim ilk harf buyuk
        //geriye kalnlari * olacak sekilde degistirip
        //bize bu halini donduren bir method olusturun
        // not:programin ilerleyen kisimlarinda isim ve soyismi bu sekilde
        //kullanmak istiyoruz

        String isim="enes";
        String soyisim="bozkurt";
        String isimGizle=isimGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim);//enes bozkurt
        System.out.println(isimGizle);//E*** B******
    }
          public static String isimGizle(String isim,String soyisim) {
        isim=isim.toUpperCase().charAt(0)+  isim.substring(1).replaceAll("\\w","*");


        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*");

              System.out.println("isim soyisim:"+isim+" "+soyisim);


        return isim+" "+soyisim;
    }
}