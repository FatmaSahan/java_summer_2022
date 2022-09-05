package day5_matematikselislemler;

import java.util.Scanner;

public class C03_Rakamlartoplami {
    public static void main(String[] args) {

       //kullanicidan dort basamkli bir sayi alin ve rakamlari toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
             //5267
        //KONTEYNIR OLUSTURDUK
        int birlerBasamagi=0;
        int rakamlariToplami=0;
        //1.kez
        birlerBasamagi=sayi % 10;//sayinin 10 ile bolumunden kalan 7
        rakamlariToplami+=birlerBasamagi;   //7 den kurtulalim
        sayi/=10;   //526
        //2.kez
        birlerBasamagi=sayi%10;  //6
        rakamlariToplami+=birlerBasamagi; // 6+7
        sayi/=10;    // 52
        //3.kez
        birlerBasamagi=sayi%10;   //2
        rakamlariToplami+=birlerBasamagi;   //6+7+2
        sayi/=10;    //5
         // 4.kez
        birlerBasamagi=sayi%10;   //0
        rakamlariToplami+=birlerBasamagi;   //5+2+6+7
        sayi/=10 ;          //0
        System.out.println("Sayinin rakamlari toplami:"+rakamlariToplami);





    }
}
