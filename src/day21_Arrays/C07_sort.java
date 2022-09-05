package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {
        int[] sayilar={5,7,1,6,4,3,9};
        //arraysi arrrays clasi kullanarak sirali hale getirebiliriz
        Arrays.sort(sayilar);// sort sirala demek
        System.out.println(Arrays.toString(sayilar));
        String[] arr={"fatma","fatih","betul","senih","melih"};
        Arrays.sort(arr);//arr arrayini siralar
        System.out.println(Arrays.toString(arr));

    }
}
