package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        //verieln bir stringte kullanilan harfleri
        //ve kullanilan harflerin tekrar sayisini
        //H=20 seklinde
        String str= "Heeeeellllooooo Woooorrrrllllllddddd";
        //spaceleri saymamasi icin onlari ve noktayi yok edelim
        str=str.replaceAll("\\W","");
        String[] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //[H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
         //H=1 e=5 l=4 gibi
        //harfleri key kac tane oldugunu value yapalim
        Map<String,Integer>  harfKullanimSayiMap=new HashMap<>();//bos yepyeni bir map olusturduk

int harfKullanimSayisi;
        for (String each:harflerArr
             ) {if(!harfKullanimSayiMap.containsKey(each)){
                 harfKullanimSayiMap.put(each,1);
        }else{
           harfKullanimSayisi=harfKullanimSayiMap.get(each);
          harfKullanimSayiMap.put(each,++harfKullanimSayisi);


        }

}
        System.out.println(harfKullanimSayiMap);}}
