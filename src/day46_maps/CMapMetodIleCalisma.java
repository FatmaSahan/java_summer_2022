package day46_maps;

import java.util.List;
import java.util.Map;

public class CMapMetodIleCalisma {
    public static void main(String[] args) {
       Map<Integer,String>  ogrenciMap=RReasobleMethods_calisma.mapolustur();
        System.out.println(ogrenciMap);
        RReasobleMethods_calisma.valuesiraliyazdir(ogrenciMap);
        List<String> isimsoyisimList=RReasobleMethods_calisma.isimsoyisimlistoLustur(ogrenciMap);
        System.out.println(isimsoyisimList);


    }


    }

