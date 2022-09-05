package day47_maps;

import day46_maps.ReasubleMethods;

import java.util.*;

public class C03_Update {
    public static void main(String[] args) {
         /*
          map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
          map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini doner
          ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak
                      map uzerinde manipulation yapmamiz lazim
           map.get(key) ==> verilen key'e ait degeri dondurur
         */
        Map<Integer,String > sinifListMap= ReasubleMethods.mapOlustur();
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false
        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisikliklerde kullanamayiz
        ReasubleMethods.tumValueSiraliYazdir(sinifListMap);
       /* 1 - Ali, Can, JDev
        2 - Enes, Cem, Tester
        3 - Taha, Emre, JDev
        4 - Derya, Deniz, Devops
        5 - Enes, Can, Tester
        6 - Taha, Deniz, JDev
        7 - Derya, Cem, Tester*/

        // Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(101,Ali, Can, JavaDeveloper)
        // bunu yapabilmek icin herbir key'e ve ona ait value'ye ihtiyacim var
        Set<Integer> keySeti = sinifListMap.keySet();
       String degisecek;//value
      for (Integer each:keySeti
       ) {
            degisecek= sinifListMap.get(each);//elemanin tamami gekldi
            System.out.println(sinifListMap.get(each));
            /*Ali, Can, JDev
            Enes, Cem, Tester
            Taha, Emre, JDev
            Derya, Deniz, Devops
            Enes, Can, Tester
            Taha, Deniz, JDev
            Derya, Cem, Tester*/

           degisecek=degisecek.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each,degisecek);

            /*
             biz key'lerin tamamini aldik
             herbir key'in value'sunu get'irdik
             value uzerinde degisikligi yapip
             yeni halini put(key, yeniDeger) ile map'e koyduk
             */
        }
        System.out.println(sinifListMap);
        /*{101=Ali, Can, JavaDeveloper, 102=Enes, Cem, Tester, 103=Taha, Emre, JavaDeveloper, 104=Derya, Deniz, Devops,
         105=Enes, Can, Tester, 106=Taha, Deniz, JavaDeveloper, 107=Derya, Cem, Tester}*/
    }}





