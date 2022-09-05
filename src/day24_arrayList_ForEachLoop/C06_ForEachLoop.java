package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        //arraydeki tum elemanlari inceleyip tek sayi olanlari liste ekleyelim
        int[] arr={1,2,3,4,6,23,6,9,1};
        List<Integer> Liste=new ArrayList<>();
        //foreach i tikla
        //INDEX LAZIM DEGILSE BUNU RAHAT KULLANABILIRIZ

        for (int each:arr//ARRAYDEKI HERBIR INTIGERE GETIR DEMEK
             ) {
            if(each%2==1){
                Liste.add(each);
            }
            System.out.println(Liste);

        }

    }
}
