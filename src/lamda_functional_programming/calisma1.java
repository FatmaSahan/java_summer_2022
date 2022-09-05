package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class calisma1 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHrfleYazdir(liste);
        System.out.println();
      //  bbuyukHrfleYazdir(liste);
        sirala(liste);
        System.out.println();
        siralama(liste);
        uzunlugu5OlanlarSil(liste);
    }
    public static void buyukHrfleYazdir(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
  //  public static void bbuyukHrfleYazdir(List<String> list){
    //    list.replaceAll(String::toUpperCase);
     //   System.out.println(list);
    public static void sirala(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    public static void siralama (List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakter)).forEach(Utils::ayniSatirdaBosluklaYazdir);


    }
    public static void ilkKarakteregoreSirala(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKrakter)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    public static void uzunlugu5OlanlarSil(List<String> list){
        list.removeIf(t-> t.length()>5);
        System.out.println(list);
    }
}
