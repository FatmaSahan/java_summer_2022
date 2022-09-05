package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        //binary search javada eleman aramanin kisa yoludur
        //ancak binary searcun calismasi icin once arrayin sirali hale getirilmesi gerekir
        //siralama yapilmazsa bulamayabilir yada yanlis bulabilir

        String[] harfler={"Y","B","D","G","O","A"};
        String arananHarf="Y" ;
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        //binarySearch bize aradigimiz elemanin index ini dondurur
        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir.emin olmak icin once sort yapmaliyiz
        Arrays.sort(harfler);// [A, B, D, G, O, Y]
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
    }
}
