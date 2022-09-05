package day46_maps;

import java.util.*;

public class C01_Map {
    public static void main(String[] args) {
        //key   value
        Map<Integer, String> sinifList = new HashMap();
        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, Java");
        sinifList.put(104, "Derya, Deniz, Tester");
        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, Java, 104=Derya, Deniz, Tester}
        System.out.println(sinifList.keySet());
        //[101, 102, 103, 104]
        System.out.println(sinifList.values());
        //[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, Java, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size());//4//4 key 4 elememnt var

        //tum ogrencilerin isimleri ve soyisimlerini sira no ile alt alta yazdiralim
        sinifList.values();
        Collection<String> tumValueColl=sinifList.values();

        String[] eachArr;
        int sira=1;

        for (String each:tumValueColl
             ) {
            //buradaki each bize herbir ogrenciye ait ayni yapidaki isim, soyisim, brans bilgilerini iceren stringler getiriyor

           eachArr=each.split(", ");
            //System.out.println(Arrays.toString(eachArr));
            //[Ali, Can, JDev]//arrayin ilk elemani
            //[Enes, Cem, Tester]//arrayin 2. elemani
            //[Taha, Emre, Java]//arrayin 3. elemani
            //[Derya, Deniz, Tester]//arrayin 4. elemani

            System.out.println(sira +"- "+ eachArr[0] +" "+ eachArr[1]);
            sira++;
            //1- Ali Can
            //2- Enes Cem
            //3- Taha Emre
            //4- Derya Deniz

        }

        List<String> sinifIsimSoyisimList=new ArrayList<>();
        for (String each:tumValueColl
             ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);

        }
        System.out.println(sinifIsimSoyisimList);
        //[Ali Can, Enes Cem, Taha Emre, Derya Deniz]

    }}
