package Practise_7;

import java.util.ArrayList;
import java.util.List;

public class calisma1 {
    public static void main(String[] args) {//arrayList sorusu
        int [] arar = {2,5,-9,45,43,11,8,102,102,47,0};
        int a =3;
        List<Integer> Listt=new ArrayList<>();
        for (int each:arar)
        {Listt.add(each);}
        List<Integer> maxListt=new ArrayList<>();//listedeki a kadar max elemani bu listeye getirelim

        int sayac=1;

        while (sayac<=a){
            int max=Listt.get(0);//en buyuk eleman olsun

            for (int i = 0; i <Listt.size() ; i++) {
                if((Listt.get(i)>max)&&!(maxListt.contains(Listt.get(i)))){
                    max=Listt.get(i);}

            }
            maxListt.add(max);//102 yi ve listeden 102 yi silerim ki bir sonraki dongude 102 yi gormesin artik

            Listt.remove(Listt.indexOf(max));
            sayac++;//sayac 2 olur while tekrar girer

        }
        System.out.println("yeni liste:"+maxListt);
}}
