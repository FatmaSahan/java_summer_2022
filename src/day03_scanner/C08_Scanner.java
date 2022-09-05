package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        //kullanicinin ismini alip ilk harfini buyuk harf yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfenisminizi giriniz");

        char ilkharf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi: "+ ilkharf);

    }
}
