package day14_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilenisim ve soyismi
        //ilkhrfler buyuk geriye kalanlar * olacak sekilde
        //yazan method olusturun
        // E*** B****** gibi
        String isim="fatma";
        String soyisim="Sahan";


         isimGizle(isim,soyisim); //  METHOD CALL

        C02_MethodCreation.rakamlarToplami(567);  //ESKI METODLARI CAGIRABILIRIZ
    }

    static Scanner isimGizle(String isim, String soyisim) {

        isim=isim.toUpperCase().charAt(0)+  isim.substring(1).replaceAll("\\w","*");



        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*");



        System.out.println("isim soyisim:"+isim+" "+soyisim);
        return null;
    }
}
