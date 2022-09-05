package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class calisma {
    public static void main(String[] args) {
        Map<String,String> ogr101=new HashMap<>();
        ogr101.put("isim","fatma");
        ogr101.put("soyisim","sahan");
        ogr101.put("brans","matematik");
        System.out.println(ogr101);
        //{soyisim=sahan, brans=matematik, isim=fatma}
        Map<String,String> ogr102=new HashMap<>();
        ogr102.put("isim","senih");
        ogr102.put("soyisim","kafa");
        ogr102.put("brans","it");
        System.out.println(ogr102);
        //{soyisim=kafa, brans=it, isim=senih}
        Map<String,String> ogr103=new HashMap<>();
        ogr103.put("isim","melih");
        ogr103.put("soyisim","buddy");
        ogr103.put("brans","yazilim");
        System.out.println(ogr103);
        //{soyisim=buddy, brans=yazilim, isim=melih}

        Map<Integer,Map<String,String>> ogrenciNestedMap=new HashMap<>();
        ogrenciNestedMap.put(101,ogr101);
        ogrenciNestedMap.put(102,ogr102);
        ogrenciNestedMap.put(103,ogr103);
        System.out.println(ogrenciNestedMap);
       // {101={soyisim=sahan, brans=matematik, isim=fatma}, 102={soyisim=kafa, brans=it, isim=senih}, 103={soyisim=buddy, brans=yazilim, isim=melih}}
        Set<Map.Entry<Integer,Map<String,String>>> ogrciEntrySet=ogrenciNestedMap.entrySet();

        for (Map.Entry each:ogrciEntrySet
             ) {
            System.out.println(each);
            //102 nolu kisinin ismini yazdir

        }
        System.out.println(ogrenciNestedMap.get(102).get("isim"));
    }


}
