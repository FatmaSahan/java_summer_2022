package day11_stringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        //soru1)kullanicidan email adresini girmesini isteyiniz
        //mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz"
        //@gmail.comile bitiyorsa "email adresiniz kaydedildi"
        //@gmail.com ile bitmiyorasa "lutfen yazimi kontrol edin "yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen email adresinizi yaziniz");
        String email = scan.nextLine();
        if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==email.length()-10) {
            System.out.println("gmail adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol ediniz");
        }

    }
}

