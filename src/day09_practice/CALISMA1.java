package day09_practice;

import java.util.Arrays;
import java.util.Scanner;

public class CALISMA1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen uzunluk giriniz");
        int uzunluk = scan.nextInt();

        int[] arr = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("lutfen " + (i + 1) + ".elemani giriniz");
            int sayi = scan.nextInt();
            arr[i] = sayi;
        }
        System.out.println(Arrays.toString(arr));
        int[] yeniArr=new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            yeniArr[(arr.length-1)-i]=arr[i];

        }
        System.out.println(Arrays.toString(yeniArr));



    }
}
