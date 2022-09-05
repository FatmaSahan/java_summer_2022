package tekraraSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soru1_arrays {
    /*33-----
    Bir arrayi tersine çeviren  method yazınız.
    Test Data:
    reverse [1, 2, 3, 4]
            return  [4, 3, 2, 1]
            */
    public static void main(String[] args) {
        tersineCevir();
    }
    public static void tersineCevir() {

        Scanner scan=new Scanner(System.in);
        System.out.println("uzunluk giriniz");
        int uzunluk=scan.nextInt();
        int[] arr=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i+". indexi giriniz");
            int sayi= scan.nextInt();
            arr[i]=sayi;

        }
        System.out.println(Arrays.toString(arr));
        int[] tersi=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {  //son indexten geriye dogru gel

            tersi[(arr.length-(i+1))]=arr[i];

        }
        System.out.println(Arrays.toString(tersi));


    }}

