package day21_Arrays;

import java.util.Arrays;

public class C06_MethodCagirarakArraysElemanEkleme {
    public static void main(String[] args) {//C05 deki metodu kullanark  arraya eleman ekleyelim
        String[] takimListesi={"suleyman","osman"};
        String eklenecekIsim="talha";
       takimListesi= C05_ArrayaeElemanEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));

    }

}
