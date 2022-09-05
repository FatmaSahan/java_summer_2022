package day43_interfaces_iterators;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10,20,30]
        for (Integer each:liste
             )

        {each+=3;
            System.out.println(each+3+" ");

        }
        System.out.println("");
        System.out.print(liste);

        System.out.println(liste);//[10,20,30]

        Iterator it1= liste.iterator();

        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //sonrasinda exception verir cunku artik
        //30 dan sonra element kalmadi ve next() rte verir
        //bu metottda geri adim yok adim adim sona ulastiktan
        // sonra basa gelmekistersek yeniden bir iterator olusturmak gerekir

          Iterator it2= liste.iterator();//[10,20,30]
          //bu yeni iteratori kullanarak listenin tum elementlerini silelim
        it2.next();//ilk elemani yuklendi
        it2.remove();
        System.out.println(liste);
        //ikinci elemani silmek icin tekrar yuklenir
        it2.next();
        it2.remove();
        System.out.println(liste);
        it2.next();
        it2.remove();
        System.out.println(liste);

        //cok fazla eleman olsaydi eger bu sekilde zor olurdu
        //bu yuzden while loop kullaniriz
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);
        Iterator it3= liste.iterator();  // while (it1.hasNext())


        while (it3.hasNext()){
             it3.next();
             it3.remove();

         }
        System.out.println("looptan sonra liste:"+liste);
        //iterator kullanarak yapabildigimiz
        //tum collection elementlerini yazdirmak
        //ve sildirmek
        //bu da bize yetmez






        //bu sekilde index yapisini kullanmadan
        // kalici olarak tum elemanlari sildik


        //iterator interface oldugu icin obje uretemeyiz
        //obje olustururken bazen new ile
        // bazende bu sekilde yani metodla olustururuz
        //liste.iterator()
        //hasNext:yanda kimse varmi demek

}}
