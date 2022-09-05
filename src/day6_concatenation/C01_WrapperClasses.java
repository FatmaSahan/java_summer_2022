package day6_concatenation;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        //wrapper claslar ilerde kullanabilecegimiz bircok metod icerir
        //bunun icin primitivleri buyk harfle yazmaliyiz

        //ornek
        String str= "java ile hayat ne guzel";
        System.out.println(str.toUpperCase());

        //ornek

        Boolean guzelMi=true;
        System.out.println(guzelMi.booleanValue()); // nokta koydugumuzda bazi metodlar gelir

        System.out.println(Short.MAX_VALUE);//shortun max degerini gorebiliriz
        System.out.println(Short.MIN_VALUE);//min degerii gororoz. ezberlemeye gerek yok bu degerleri

        //orn
        String ogrNo="123456";
        //kulllanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 5 bsamakli bir sifre giriniz");
        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilrn sifre:"+sifre);
        System.out.println("integer sifre:"+sifreSayi);
        //orn
        System.out.println("girilen sifrenin 3 fazlasi:"+(sifre+3));
        System.out.println("integer sifrenin 3 fazlasi:"+(sifreSayi+3));






    }
}
