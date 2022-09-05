package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayaeElemanEkleme {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen method olusturalim
        String [] sinifListesi={"Ali Can","Fatma","Betul"};
        String eklenecekIsim="Murat Babayigit";
        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        //sinif listesinden 1 fazla uzunlukta yeni bir array olusturalim
String[] yeniSinifList=new String[sinifListesi.length+1];
        for (int i = 0; i <sinifListesi.length; i++) {
            yeniSinifList[i]=sinifListesi[i];//ESKI ARRAYI YENIYE EKLEDIK//EKELNECEK ISIM KALDI ONUDA EKELYELIM
            //ILK ARAYIN SON INDEXINE ATAMA YAAPLIM
            yeniSinifList[yeniSinifList.length-1]=eklenecekIsim;


        }
        System.out.println(Arrays.toString(yeniSinifList));


return yeniSinifList;
    }}
