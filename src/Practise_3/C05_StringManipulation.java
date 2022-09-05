package Practise_3;

import java.util.Scanner;

public class C05_StringManipulation {
    public static void main(String[] args) {
        //kullnicidan ismini ve soyisimini isteyin ve ful ismini buyuk harfle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen full isminizi giriniz:");
        String isim= scan.nextLine();
        String soyisim=scan.nextLine();
        isim=isim.substring(0).toUpperCase();
        soyisim=soyisim.substring(0).toUpperCase();
        System.out.println("fullname:"+isim+" "+soyisim);

    }

    public static class C012_StringManipulation {
        public static void main(String[] args) {
             // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
            // String  str 1= "$13.99"
            // String str 2= "$10.55"
            // ipucu: Double parseDouble() methodunu kullanabilirsiniz.
            //
            //  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
            //1) \\d    ==> tum rakamlar
            //    \\D    ==> tum rakam disi character ler
            //2) \\w   ==> A->Z     a->z         0->9    _
            //    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
            //3) \\s   ==> space
            //    \\S   ==> space disindaki hersey  */

            String  str1= "$13.99";
            String str2= "$10.55";
            str1=str1.replaceAll("\\D","");
            System.out.println("str1:"+str1);

            str2=str2.replaceAll("\\D","");
            System.out.println("str2:"+str2);
            System.out.println(str1+str2); //string olarak toplar//13.9910.55

            //bu stringleri sayiya cevirmek icin" parse double" kullaniriz
            double sayi1=Double.parseDouble(str1);
            double sayi2=Double.parseDouble(str2);
            double toplam=(sayi1+sayi2)/100;
            System.out.println("toplam="+"$"+toplam);

        }
    }
}
