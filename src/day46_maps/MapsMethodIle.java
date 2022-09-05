package day46_maps;

import java.util.List;
import java.util.Map;

public class MapsMethodIle {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =ReasubleMethods.mapOlustur();
        System.out.println(ogrenciMap);
        // value'lari sira numarali olarak yazdirin
        ReasubleMethods.tumValueSiraliYazdir(ogrenciMap);
        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= ReasubleMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin

    }


        }





