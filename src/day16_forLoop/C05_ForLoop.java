package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Soru 10)
        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //  sonucu yazdiran bir method yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        aralariTopla(sayi1,sayi2);
    }
    public static void aralariTopla(int sayi1,int sayi2)
    {
        int toplam=0;

        if (sayi1 <=sayi2) {
            for (int i = sayi1; i <= sayi2; i++){
           toplam+=i;}

        }else if(sayi1>sayi2) {
            for (int i = sayi1; i <= sayi2; i--) {
                toplam += i;

            } }
        System.out.println("aralardaki sayilarin toplami="+toplam); //soutu yazdigin yere dikkat et

    }
}







