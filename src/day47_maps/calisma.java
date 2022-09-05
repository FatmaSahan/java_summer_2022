package day47_maps;

import day46_maps.RReasobleMethods_calisma;

import java.util.*;

public class calisma {
    public static void main(String[] args) {
        Map<Integer,String> siniflistesiMap=RReasobleMethods_calisma.mapolustur();
        System.out.println(siniflistesiMap);//replace yapamadik oyuzden collectina atadik
        Collection<String> valueCol=siniflistesiMap.values();
        for (String each:valueCol
             ) {
            each=each.replaceAll("JDev","developer");
            System.out.println(each);
        }




    }}


