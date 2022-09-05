package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {
        //iki sekilde arrays olusturabiliriz

       int sayilar[]={1,2,3};
               //yada
        String harfler[]=new String[4];
        System.out.println("sayilar ARRAYININ LENGHTI:"+sayilar.length);//3
        System.out.println("harfler ARRAYININ LENGHTI:"+harfler.length);//4
        System.out.println(Arrays.toString(harfler));//{null,null,null,null}
        System.out.println("sayilarin son elementi:"+harfler[harfler.length-1]);//3
        System.out.println(sayilar[5]);//array exepcion verir
        }
}
