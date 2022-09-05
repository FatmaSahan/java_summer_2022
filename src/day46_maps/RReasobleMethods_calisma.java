package day46_maps;

import day40_final.A;

import java.util.*;

public class RReasobleMethods_calisma {
      public static Map<Integer,String> mapolustur(){
          Map<Integer,String> sinifMap=new HashMap<>();
          sinifMap.put(101,"Ali, Can, JDev");
          sinifMap.put(102,"Enes, Cem, Tester");
          sinifMap.put(103,"Taha, Emre, JDev");
          sinifMap.put(104,"Derya, Deniz, Devops");
          sinifMap.put(105,"Enes, Can, Tester");
          sinifMap.put(106,"Taha, Deniz, JDev");
          sinifMap.put(107,"Derya, Cem, Tester");
          return sinifMap;
}
public static void valuesiraliyazdir(Map<Integer, String> ogrenciMap) {
         int sira=1;
        for (String each: ogrenciMap.values()
             ) {
            System.out.println(sira+"-"+each);
            sira++;
        }}
    public static List<String> isimsoyisimlistoLustur(Map<Integer, String> ogrenciMap) {
        List<String> isimsoyisimlist = new ArrayList<>();
        String[] arr;
        for (String each : ogrenciMap.values()
        ) {
            arr = each.split(", ");
            isimsoyisimlist.add(arr[0] + " " + arr[1]);

        }
        return isimsoyisimlist;


    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> siniflistMap) {
          Map<Integer,String> bransogrencisayisiMap=new TreeMap<>();
       Collection<String> valucoll=siniflistMap.values();
        String[] valuearr;
        String brans;
        Integer bransdakiogrnSayisi;
        for (String each:siniflistMap.values()
             ) {
            valuearr=each.split(", ");
            brans=valuearr[2];

            if(!bransogrencisayisiMap.containsKey(brans)){
              //  bransogrencisayisiMap.put(brans,1);?????

            }






    }
}}








