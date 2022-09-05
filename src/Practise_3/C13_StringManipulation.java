package Practise_3;

import java.util.Scanner;

public class C13_StringManipulation {

    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
       Scanner scan=new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz");
        String isim= scan.nextLine();
        String soyIsim=scan.nextLine();
        if(isim.length()>soyIsim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        } else if (soyIsim.length()>isim.length()) {
            System.out.println("soyisminiz isminizden daha uzun");

        }else System.out.println("isminizin uzunlugu ile soyisminizin uzunlugu ayni");


    }}




