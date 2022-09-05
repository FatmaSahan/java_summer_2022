package calisma;

import java.util.*;

public class ClismaSayfam {
    public static void main(String[] args) {
        /*Bir dizi içerisindeki pozitif tam sayı sayısını ve
        negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

        Örnek:
        countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
        // Toplam 10 pozitif sayı var.
        // Tüm negatif sayıların toplamı -65'tir.

        Notlar :
        Boş bir dizi verilirse, boş bir dizi döndürür: []
        0 pozitif değil.*/
        int[] sayilar={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        int[] pozVeNegaSayi=dondur(sayilar);}

    public static int[] dondur(int[] sayilar) {

        int count=0;
        int toplam=0;

        for (int each:sayilar) {
            if(each>0){
                count+=1;
            } else if (each<0) {
                toplam+=each;

            }
        }System.out.println("toplam "+count+"pozitif sayi vardir" );

        return  dondur(sayilar);
    }
}






























