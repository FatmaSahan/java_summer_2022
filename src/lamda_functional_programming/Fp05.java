package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        System.out.println(coursesList);
        System.out.println(ortalmaPuanlarVerilenSayidanBuyukMu(coursesList,75));
        System.out.println(kelimeyiIceriyotMu(coursesList,"Turkish"));
        System.out.println( ortPuaniEnYuksekOlaniBul(coursesList));
        System.out.println(ortalamaPuanaGoreSiralaVeIlkiAtla(coursesList,1));
    }
    //tum ortalma puanlarin verilen sayidan buyuk olup olmadigini kontrol eden method olusturun
    public static boolean ortalmaPuanlarVerilenSayidanBuyukMu(List<Courses> list,double x){
      return   list.stream().allMatch(t-> t.getAverageScore()>x);
    }
    //kurs adlarinin en az birinin vrilen kelimeyi icerip icermedigini kontrol eden method olusturun

    public static boolean kelimeyiIceriyotMu(List<Courses> list,String kelime){

      return   list.stream().anyMatch(t-> t.getCourseName().contains(kelime));
    }
    //ortalam puani en yuksek olan kursu bulmak icin bir method olusturun
    public static String ortPuaniEnYuksekOlaniBul(List<Courses> list){
     return   list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();

}
//list ogelerini artan duzende ortalama puana gore siralayin ve ilk verilenleri atlayin
    //soruda bizden yeni bir list istiyor
    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkiAtla(List<Courses> list,int x){
    return     list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());

    }
}
