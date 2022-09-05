package day18_doWhileLoop;

import java.util.Scanner;

public class C06_doWhileLoop {
    public static void main(String[] args) {
        //Soru 4)
        //    Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        //    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz”
        //    yazdirip basa donun
        //    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini
        //    ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.package day18_while_doWhileLoop;


        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayiAdedi=0;
        int sayiToplami=0;
        int yanisSayiAdedi=0;


        do {
            System.out.println("pozitif sayi giriniz");
            sayi=scan.nextInt();
            if (sayi>0){

                sayiAdedi++;
                sayiToplami+=sayi;
            }else if (sayi<0){
                System.out.println("negatif sayi giremezsiniz");
                yanisSayiAdedi++;
            }}
        while (sayi!=0); //0 olmadigi surece calis 0 oldugunda bitir
        System.out.println(sayiAdedi+" "+"pozitif sayi girdiniz ve toplamlari:"+sayiToplami);
        System.out.println(yanisSayiAdedi+" "+ "negatif sayi girdiniz");
    }
}
