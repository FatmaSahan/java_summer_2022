package day15_overloading_Forlop;

import java.util.Scanner;

public class C01_Overloading_Forloop {
    public static void main(String[] args) {

        //verilen iki sayiyi carpip sonucu bize donduren metodu yazalim
        //donduren return eden diyorsa "returntype" yazdir diyorsa "void"
        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1,sayi2);

        System.out.println("iki sayinin carpimi="+sayi1*sayi2);
        ///biz burda getirdigi degeri atamak icin variable yani" esitlik" olusturuyoruz
        //kapici ornegi gibi o her harikarda ekmegi getirir esittlik olsada olmasada

    }

    public static int carpGetir(int sayi1, int sayi2) {
        return sayi1*sayi2;

        //biz burda 100 satir islemde yapsak "return "yazmazsak donus islemi olmaz

       /* int sonuc=sayi1*sayi2
        bu sekildede yazabilirdik bize bagli
                return sonuc;
       */
    }



    }






