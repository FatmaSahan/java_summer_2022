package day22_multiDimensenalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        //array i array yapan sembo[] dur
        //arrayliste ise <> diamond (elmas )semboludur
        //liste eleman tek tek ekleyebiliriz

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);//[]
        //bir Liste eleman eklemek istersek
        isimler.add("Basak");
        System.out.println( isimler.add("Ayse"));//true doner

        //Stringte bir metod calistirdigimizda assign yapmazsak String degismiyordu
        //String isim="suleyman"
        //isim.toUpperCase();//SULEYMAN
        //sout(isim)......Suleyman
        System.out.println(isimler);
        //Listen tek olumsuz tarafi arraty alt yapisini kullandigi icin
        // elemanlari birer birer eklemek zorunda olmamizdir

    }
}
