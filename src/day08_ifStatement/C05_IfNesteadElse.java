package day08_ifStatement;

import java.util.Scanner;

public class C05_IfNesteadElse {
    public static void main(String[] args) {

        //nested if kullanarak asagidaki soruyu cozen kod yaziniz
        //kullanicidan bir sifre girmesini isteyin
        //eger ilk harf buyuk harf ise "A" olup plmadigini kontrol edin
        //ilk harf 'A' ise" gecerli sifre "degilse "gecersiz sifre" yazdirin
        // ilk harf 'z' olup olmadigini kontrol edin.ilk harf z ise "gecerli sifre" degilse "gecersizsifre" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifreyi giriniz");

        String sifre = scan.nextLine(); //sifre yi aldim bununla
        char ilkHarf = sifre.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if (ilkHarf == 'A')
            { System.out.println("Gecerli Sifre");}
             else
            {System.out.println("Gecersiz Sifre");}}
        else
            if (ilkHarf>='a'&& ilkHarf<='z') {
                if (ilkHarf == 'z')
                {System.out.println("Gecerli Sifre");}
                else
                {System.out.println("Gecersiz Sifre");}


            }

        if (ilkHarf == 'z') {
                    System.out.println("Gecerli Sifre");
                } else {

        System.out.println("lutfen ilk karkter icin sadece harf kullanin");
            }
         }
      }



