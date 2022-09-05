package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //KULLANICIDAN IKI SAYI AL VE BUNLARIN CARPIMLARINI YAZDIR

        System.out.println("lutfen ilk sayiyi girin");
        double sayi1=scan.nextDouble();

        System.out.println("lutfen ikinci sayiyi girin");
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayilarin carpimi:" +sayi1*sayi2);
    }
}
