package lamda_functional_programming;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1)lamda (fuctional programing java8 ile kullanilmaya basladi
    2)Fuctional Programing de ne yapilacak(what to do) yogunlasilir
    Structured Programing nasil yapilacak(how to do) uzerine yogunlasir
    3)Fuctional Programing Arrays ve Collections ile kullanilir
    4)entryset() methodu ile map sete donusturulerek fuctional programing te kullanilir

  */
    public static void main(String[] args) {
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
        ListElemanlariniYazdirStructured(liste);
        System.out.println();
        //8 9 131 10 9 10 2 8
        ListElemanlariniYazdirFuctional(liste);
        //8 9 131 10 9 10 2 8
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
       // 8 10 10 2 8
        System.out.println("fuctional");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKaresiniYazdir(liste);
        //81 17161 81
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);//729 2248091
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemnlarinKupununCarpimi(liste);
        System.out.println();
        getMaxEleman01(liste);
        System.out.println();
        getMaxEleman02(liste);
        System.out.println();
        yedidenBuyukMin(liste);
        System.out.println();
        yedidenBuyukMin01(liste);
        System.out.println();
        yedidenBuyukMin02(liste);
        System.out.println();
        getTersSiralamylaTekrarsizElemanlarinYarisi(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami01(liste);
        tekrarsizCiftElemanlarinKareToplami02(liste);
        tekrarsizCiftElemanlarinKareToplami03(liste);
        tekrarsizCiftElemanlarinKupleriniCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        terSiralamaylaTekrarsizElemanlarinYarisi(liste);


    }
    //1) Ardışık list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)
    public static void ListElemanlariniYazdirStructured(List<Integer> list){
        for (Integer w:list
             ) {
            System.out.print(w+" ");

        }
    }
    //list elemanlari arasindan en buyuk degeri veren methodu yaziniz

    public static void ListElemanlariniYazdirFuctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));
        //t=> lamda expretion
        //stream()methodu collectiondan elementleri akisa dahil etmek icin ve methodlara ulasmak icin kulanilir
    }
    // çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
     public static void ciftElemanlariYazdirStructured(List<Integer> list){
    for (Integer w:list
         ) {
        if (w%2==0){
            System.out.print(w+" ");
        }
    }
}
// çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method olarak yazalim
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }
    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKaresiniYazdir(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));


            //elemanlarin degeri degisecekse map metodu kullanilir
    }
    //tek list elementlerinin kuplerini tekrarsiz olarak yazdirin
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        //distinct() uniuqe yapar
    }
    //Tekrarsiz cift elemanlarin kare toplamlarini hesaplayan bir method olusturunuz
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
      Integer toplam=  list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
       //int kullanabiliriz//Integer repar clastir
        System.out.println(toplam);
    }
    //tekrarsiz cift elemanlarin kupunun carpimini veren method olusturalim
    public static void tekrarsizCiftElemnlarinKupununCarpimi(List<Integer> list){
      Integer carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }
    //list elemanlari arasindan en buyuk degeri veren methodu yaziniz
    //1.yol
    public static void getMaxEleman01(List<Integer> list){
       Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println(max);
    }
    //2.yol
    public static void getMaxEleman02(List<Integer> list){
     Integer max=   list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
     //sorted kucukten buyuge siralar

        System.out.println("max = " + max);

    }//odev
    //list elemanlari arasindan en kucuk elemani veren methodu yaziniz

    //list elemanlari arsindandan 7 den buyuk cift en kuck elemani veren methodu yaziniz
    public static void yedidenBuyukMin(List<Integer> list){
        //1.yontem
       Integer min= list.stream().filter(t->t>7).filter(t-> t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);

        System.out.println("min = " + min);
    }
    //2.yontem
    public static void yedidenBuyukMin01(List<Integer> list){
       Integer minn= list.stream().distinct().filter(t-> t>7).filter(t-> t%2==0).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t, u)-> u);
        System.out.println("minn = " + minn);

    }
//3.yol
   public static void yedidenBuyukMin02(List<Integer> list){
      Integer minn=  list.stream().distinct().filter(t-> t>7).filter(t-> t%2==0).sorted().findFirst().get();
       System.out.println("minn = " + minn);
    }
    //ters siralama ile tekrarsiz ve 5 ten buyuk elemanlarin yari degrlerini(elemanin 2 ye bolum sonucunu) bulan bir method olusturun
    public static void getTersSiralamylaTekrarsizElemanlarinYarisi(List<Integer> list){
     List<Double> sonuc=   list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

        //1. Yol
        public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list){

            Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
            System.out.println(toplam);

        }
        //2. Yol
        public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list){

            Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
            System.out.println(toplam);

        }

        //3. Yol
        public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list){

            Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
            System.out.println(toplam);

        }

        //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

        public static void  tekrarsizCiftElemanlarinKupleriniCarpimi(List<Integer> list){

            Integer carpim = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
            System.out.println(carpim);
        }

        //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

        public static void getMaxEleman(List<Integer> list){

            Integer max = list.stream().distinct().reduce(Math::max).get();

            System.out.println(max);

        }
        //Ödev
        //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

        //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

        public static void yedidenBuyukCiftMin(List<Integer> list){

            Integer min =list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
            System.out.println(min);
        }

        //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
        public static void terSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
           //???

        }
    }



