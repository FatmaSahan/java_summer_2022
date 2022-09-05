package day21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        int[] sayilar={3,7,15,4,27,10};
        Arrays.sort(sayilar);//siraladi
        System.out.println(Arrays.toString(sayilar));//[3, 4, 7, 10, 15, 27]
        System.out.println(Arrays.binarySearch(sayilar,7));//2
        System.out.println(Arrays.binarySearch(sayilar,10));//3
        System.out.println(Arrays.binarySearch(sayilar,3));//0
        System.out.println(Arrays.binarySearch(sayilar,15));//4
        System.out.println(Arrays.binarySearch(sayilar,4));//1
        System.out.println(Arrays.binarySearch(sayilar,6));// -3 olsaydi nerde olurdu bunun indexini vereri
        System.out.println(Arrays.binarySearch(sayilar,-4));//0
        System.out.println(Arrays.binarySearch(sayilar,18));//-6


        //aradigimiz element arrayda yoksa java hem olmadigini
        //hemde olsaydi nerde olacagini bize dondurur
        //olmadigini ifade icin-1  den baslar index degil sira olarak doner
        //DIKKKAAAT:;siralama kullanir

    }
}
