package lamda_practice01;

import day40_final.A;

import java.util.*;
import java.util.stream.Stream;


public class Lambda01 {
    //okul projesinde listele vb lamda expression ile yapiniz
    static ArrayList<String> names = new ArrayList<>(
            Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih", "Ersin", "Mevlit"));
    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, -54, 9, 35, 35, 34));

    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));
    /* TASK :
     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
  /*  public static void aHarfIcerenleriSil(ArrayList<String> names){
      1.yol
       System.out.println(names.stream().
                map(m -> m.toLowerCase()).
                filter(m -> !m.contains("a")).
                collect(Collectors.toList()));*/

    //2.yol

    public static void aHarfIcerenleriSil(ArrayList<String> names) {
        names.removeIf(m -> m.contains("a") || m.contains("A"));
        System.out.println(names);
    }

    //2.soru
    //en buyuk elemani bul
    public static void enBuyukSayiyiBul(List<Integer> numbers) {
        Optional<Integer> maxSayi = numbers.stream().reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi);

        //2.yol
        System.out.println(numbers.stream().reduce(Integer::max));


     /*  reduce(Integer::max));//spesifik bir method cagirirsani daha hizli yani alirsinz
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
                kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
                reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
                reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
    */
    }

    // soru: List'teki tum elemanlarin toplamini yazdiriniz.
    //Lambda Expression...
    public static void tumElemanlariTopla(List<Integer> numbers) {
        Integer sum = numbers.stream().reduce((m, u) -> m + u).get();
        System.out.println("sum = " + sum);

        //2.yol
        Integer toplam = numbers.stream().reduce(Integer::sum).get();
        System.out.println("toplam = " + toplam);
    }

    //LISTEDEKI CIFT ELEMANLARIN CARPIMINI YAZDIRIN
    public static void ciftElemanlarCarpimi(List<Integer> numbers) {
        //lamda experission ile yaptik
        System.out.println(" = " + numbers.stream().
                filter(Methodlarim::ciftleriBul).
                reduce(1, (a, b) -> a * b));


        //2.yol lamda method referanse ile yaptik

        System.out.println(numbers.stream().
                filter(Methodlarim::ciftleriBul).
                reduce(Math::multiplyExact));
    }

    //TODO task tek sayilarin  karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {
        numbers.stream().//liste akisa alindi
                filter(Methodlarim::teksayilarBul).
                map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(Methodlarim::yazdir);


    }

    //list elemanlarini son harfine gore ters sirali print ediniz
    public static void sonHarfeGoreTersSirala(List<String> menu) {
        menu.stream().
                sorted(Comparator.comparing(Methodlarim::sonHarfiBul).
                        reversed()).forEach(Methodlarim::yazdir);

        //2.yol
        menu.stream().
                sorted(Comparator.comparing(t -> t.toString().//her eleman stringe cevrildi
                        charAt(t.toString().length() - 1)).reversed()).
                forEach(Methodlarim::yazdir);
    }

    //list elemanlarinin karakter saayisisnin 7 ve 7 den az olma durumunu kontrol ediniz
    public static void karakterSayi7Ve7deAzMi(List<String> menu) {
        //ilkel yontem:
        boolean kontrol = menu.stream().allMatch(t -> t.length() <= 7);//tru gelirse if bodysi calisir
        if (kontrol) {
            System.out.println("list elemanlari 7 den daha az harften olusmus");
        } else
            System.out.println("bazi elemanlar 7 den daha fazla harf iceriyor");

    }
    //2.yontem:lamdayala

public static void karakterSayi7Ve7deAzMii(List<String> menu){
    System.out.println( menu.stream().allMatch(t-> t.length()<=7) ?//ternary kullnadik
            "list elemanlari 7 den daha az harften olusmus":
            "bazi elemanlar 7 den daha fazla harf iceriyor");

}
//odev:karakter sayisi en buyuk olani yazdiriniz
    public static void lenghtEnBuyukOlanBul(List<String> menu){
     String str=   menu.stream().
             sorted(Comparator.comparing(t-> t.toString().
                     length()).reversed()).findFirst().get();
        System.out.println(str);
    }
    //2. yol
    public static void lenghttEnBuyukOlanBul(List<String> menu){
        /*//limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
       // şekilde kesilmiş bir akış return eder. Stream return eder.*/
         Stream<String> sonisim= menu.stream().
                sorted(Comparator.comparing(t-> t.toString().
                        length()).reversed()).limit(1);
        System.out.println(Arrays.toString(sonisim.toArray()));

         /*
  TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
  Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
   */






    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

    }}
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..










