package day08_ifStatement;

import java.util.Scanner;

public class C04_IfNesteadElse {
    public static void main(String[] args) {
        //kullanicidan 4 bsamakli bir sayi girmesini isteyin
        //girdigi sayi 5 e bolunuyorsa son rakamini kontrol edin
        //son rakam 0 ise 5 'e bolunen cift sayi yazdirin
        //son rakam 0 degilse 5'e bolunen tek sayi yazdirin
        //5' e bolunmuyorsa tekrar deneyin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        if(sayi<1000||sayi>9999) {
            System.out.println("lutfen gecerli bir sayi giriniz");
        }else if(sayi%5==0)
            {
            if (sayi%10==0) {
                System.out.println("sayi 5'e bolunen cift sayidir");
            } else {
                System.out.println("sayi 5'e bolunen tek sayidir");
            }} else {
            System.out.println("sayi 5'e tam olarak bolunmez");}
    }}
