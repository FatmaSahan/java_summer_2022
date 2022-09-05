package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        //kullanicidan bir array in boyutunu ve tum elementlerini alarak
        //bir array olusturup bu araryi bize donduren bir method yaziniz
        int[] sayilar = arrayOlustur();
        System.out.println(Arrays.toString(sayilar));

    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanli bir array olusturmami istersin");
        int uzunluk = scan.nextInt();
        int[] olusturulan = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            int sayi= scan.nextInt();
            olusturulan[i] = sayi;
        }
        return olusturulan;


    }}