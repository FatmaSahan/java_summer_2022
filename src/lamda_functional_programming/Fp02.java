package lamda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {
     /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
     */
     public static void main(String[] args) {
         //ardisik list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun
         List<Integer> liste = new ArrayList<>();
         liste.add(8);
         liste.add(9);
         liste.add(131);
         liste.add(10);
         liste.add(9);
         liste.add(10);
         liste.add(2);
         liste.add(8);
         System.out.println(liste);
         ListElemanlariniYazdirFuctional(liste);
         System.out.println();
         ciftElemanlariYazdirFunction(liste);
         System.out.println(liste);
         tekElemanlarinKareleriniYazdir(liste);
         System.out.println();
        tekElemanlarinKupleriniYazdir(liste);
     }
     public static void ListElemanlariniYazdirFuctional(List<Integer> list){
         list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
     }
     //ardisik cift list elemanlarini yanyna ve aralarinda bosluk birkarak yazdiran method olusturunuz
    public static void ciftElemanlariYazdirFunction(List<Integer> list){
         list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
         //ardisik tek list elemanlarinin karelerini aralarinda bosluk birakarak yazdiran metod olusturun
    }
    //ardisik tek list elemanlarinin karelerini aralarinda bosluk birakarak yazdiran metod olusturun
public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
         list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

}
//tek list elemanlarinin kuplerini tekrarsiz aralarinda bosluk birakarak yazdirin
    public static void tekElemanlarinKupleriniYazdir(List<Integer> list){
         list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
}
