package day21_Arrays;

import calisma.CalismaSayfam_5;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        //BU KONUDAN BAGIMSIZ NOT
        //IKI ARRAYIN ESIT OLMASI ICIN HEM ELEMANLAR HEMDE SIRALAMA AYNI OLMALI
        //SIRALAMA AYNI OLMAYAN ARRAYLERSDE SORT YAPARAK ESITLEYEBILIRIZ
        //split metodu bir array metodu degil
        //String metoduudr
        //array dondurdugu icin bu konuda anlatiyoruz
        //split() ile herhangi bir Stringi ISTEDIGIMIZ SEKILLERDE PARCALARA BOLUP
        //BIR ARRAY HALINE GETIRIYORUZ

        String str="Java ne kadar guzel";
        String[] kelimeler=str.split(" ");//bosliktan ayir bol
        System.out.println(Arrays.toString(kelimeler));//[Java, ne, kadar, guzel]
        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));//[Java ,  kadar guzel]
        String[] kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE));//[Java n,  kadar guz, l]
        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));//[J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]





    }}