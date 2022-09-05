package day13_creation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin.
        //        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        //        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //        - Ilk harf buyuk harf olmali
        //        - Son harf kucuk harf olmali
        //        - Sifre bosluk icermemeli
        //        - Sifre uzunlugu en az 8 karakter olmali
        //Collapse

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");

        String sifre= scan.nextLine();
        int kontrol=0;

         if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("ilk harf buyuk harf olmali");

    }

         if(sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
             kontrol++;
         }else {
             System.out.println("son harf kucuk olmali");
         }

         if(sifre.length()>=8){
             kontrol++;

         }else {
             System.out.println("sifre en az 8 karakter olmali");
         }

         if(!sifre.contains(" ")){
             kontrol++;

         }else {
             System.out.println("lutfen bosluk birakmayiniz");}

         if(kontrol==4){
             System.out.println("islem basariyla tamamlanmistir");

         }else{
             System.out.println("lutfen yeni bir sifre giriniz");
         }





    }
}
