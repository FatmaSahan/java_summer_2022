package day08_ifStatement;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        //emeklilik kontrolu yapan bir program yaziniz
        //degisken olarak K(kadin) VE E(erkek) sembollerini kabul edin
        //farkli bir harf yada sembol girilirse hata mesaji verin
        //emeklilikicin kadinlara yas siniri 60
        //erkeklere 65 olsun
        //negatif yada 80 den buyukse hata mesaji verin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen cinsiyetinizi giriniz");


        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi yaziniz");
        double yas=scan.nextDouble();
        if(cinsiyet== 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli bir yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekli olabilirsin");
            }
             }else if(cinsiyet== 'K') {
                    if (yas < 0 || yas > 80) {
                        System.out.println("gecerli bir yas giriniz");
                    } else if (yas < 60) {
                        System.out.println("emekli olamazsin");
                    } else {System.out.println("emekli olabilirsin");
                }

        }
    }

}
