package day46_maps;

import java.util.*;

public class calisma {
    public static void main(String[] args) {

    Map<Integer,String> sinifList=new HashMap<>();
    sinifList.put(101,"ayse, keskin, mat");
    sinifList.put(102,"fatma, sahan, turk");
    sinifList.put(103,"hulya, sahin, kim");
    sinifList.put(104,"betul, knka, resim");
        System.out.println(sinifList);
        sinifList.keySet();
        sinifList.values();
        sinifList.values().size();
        System.out.println(sinifList.values());
        Collection<String> tumValueColl=sinifList.values();
        int sira=1;
        System.out.println(tumValueColl);
        String[] arr;
        for (String each:tumValueColl
             ) {
            arr=each.split(", ");
            System.out.println(sira +"- "+ arr[0] +" "+ arr[1]);
            sira++;

        }
        List<String> sinifisimsoyisimList=new ArrayList<>();
        for (String each:tumValueColl
             ) {
            arr=each.split(", ");
            sinifisimsoyisimList.add(arr[0]+" "+arr[1]);

        }
        System.out.println(sinifisimsoyisimList);

    }
}
