package day47_maps;

import day46_maps.ReasubleMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUPdate {

    public static void main(String[] args) {
        //soyismi can olanlarin bransini datascince yapalim
        Map<Integer,String> siniflistMap=ReasubleMethods.mapOlustur();
        //ENTYLERI ALALIM
        Set<Map.Entry<Integer,String>> entrySeti=siniflistMap.entrySet();
        String entryValue;
        String[] entryArr;
        for (Map.Entry<Integer,String> entry:entrySeti
             ) {
           entryValue=entry.getValue();
           entryArr=entryValue.split(", ");
           if(entryArr[1].equals("Can")){
               entryArr[2]="Data Scince";
           }
            entry.setValue(entryArr[0]+", "+entryArr[1]+", "+entryArr[2]);


        }
        System.out.println(siniflistMap);
            }}

