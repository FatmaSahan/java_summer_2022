package day25_consrctur;

import java.util.Random;
import java.util.Scanner;

public class C02_Constractur {
    public static void main(String[] args) {
        C01 obj1=new C01();//CO1 CLASINDAN OBJE OLUSTURDUK
        //bu obje yardimiyla co1 deki variabla cagirabiliriz
        System.out.println(obj1.sayi);//instanas variable oldugu icin 0 atar
   obj1.deneme();//co1 den deneme metodu cagirir

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        //OBJE OLUSTURMAK ICIN MUTLAKA CONSRUCTUR KULLANMALIYIZ
        //SACANNER VE RANDOM DA BIR OBJEDIR
        //CONSRUCTUR CALISIR SA OBJE OLUSTURABILIRIZ
        //AYNI KALIBI KULLANARAK BIRDEN FAZLA FAKLI OBJE OLUSTURABILIRIZ






    }
}
