package day47_maps;

import day46_maps.ReasubleMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {

            Map<Integer,String> sinifListMap = ReasubleMethods.mapOlustur();
            System.out.println(sinifListMap);
            // ogrenci listesini isim soyisim olarak yazdirin
            ReasubleMethods.tumValueSiraliYazdir(sinifListMap);
            // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
           ReasubleMethods.bransOgrencisayisiYazdir(sinifListMap);


    }
}
