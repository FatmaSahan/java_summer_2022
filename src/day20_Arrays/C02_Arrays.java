package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[3];
        System.out.println(sayilar);//referan s numarasi verir
        System.out.println(Arrays.toString(sayilar));//[0,0,0]
        sayilar[0]=5;
        sayilar[1]=3;
        sayilar[2]=10;
        System.out.println(Arrays.toString(sayilar));
        //direk te atama yapabiliriz
        String sinifListesi[]={"ALI","AYSE","MEHMET"};
        //ATAMA YAPARK HERHANGI BIR IDEX TEKI ELEMANI DEGISTIREBILIRIZ
        sinifListesi[1]="FATMA";
        System.out.println(Arrays.toString(sinifListesi));//{"ALI","FATMA","AYSE"}
        //ARRAYDAKI BIR ELEMANI DIREK YAZIRABILIRIZ
        System.out.println(sinifListesi[1]);//referans vermeden fatma yazar







    }

    }

