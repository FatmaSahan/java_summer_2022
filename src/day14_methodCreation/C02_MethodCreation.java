package day14_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //verilen 3 basamakli bir sayinin rakamlari tolamini yazsiran bir method olusturalim

        int sayi=345;
        rakamlarToplami(sayi);


    }
    public static void rakamlarToplami(int sayi){
       int birlerBasamagi=0;
       int rakamlartoplami=0;

       birlerBasamagi=sayi%10;
       rakamlartoplami+=birlerBasamagi;
       sayi/=10;  // 12 olur

       int onlarBasamagi=sayi%10;
       rakamlartoplami+=onlarBasamagi;
       sayi/=10;  // sayi 1 olur

       int yuzlerBasamagi=sayi%=10;
       rakamlartoplami+=yuzlerBasamagi;
       sayi/=10;
        System.out.println("Rakamlar Toplami="+rakamlartoplami);


    }

}
