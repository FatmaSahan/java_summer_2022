package Practise_3;

import java.util.Scanner;

public class C06_StringManipulation {
    public static void main(String[] args) {
        ////Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
        ////yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.



        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
        ////yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
       Scanner scan=new Scanner(System.in);
        System.out.println("lutfeniki kelime");
        String klme1=scan.next();
        String klme2=scan.next();
        String KELIMELER=klme1.concat(klme2);
        System.out.println("kelimeler:"+KELIMELER);
        String BIRLESTIR=klme1.substring(1).concat(klme2.substring(1));
        System.out.println("birlestir:"+BIRLESTIR);



    }
}
