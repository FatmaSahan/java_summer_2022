import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tekrarSorulari30_40 {
    public static void main(String[] args) {
        /*31----


   /*
    32----
        İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

        num1 = num2 => true
               */
        Scanner scann=new Scanner(System.in);
        System.out.println("lutfen iki tane sayi giriniz");
        int sayi1 = scann.nextInt();
        int sayi2 = scann.nextInt();

        esitMi(sayi1,sayi2);
    }

    public static boolean esitMi(int sayi1, int sayi2) {
        boolean sonuc = true;
        while (sonuc) {
            if (sayi1 == sayi2) {
                System.out.println(sonuc);
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
        return sonuc;}}

       /*
}
     /*
​
     ["Pair"]
    ************************************************************************

    ************************************************************************

                ************************************************************************
        37-----
                Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
​
        Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0
​
        Test data
        hackerDili("javayı severim")
        j4v4yı 53v3r1m
​
        İpucu harfleri değiştirin ve ekrana yazdırın.
    ************************************************************************
        38----

    ************************************************************************
        39-----
                Bir dizi içerisindeki pozitif tam sayı sayısını ve
        negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
​
        Örnek:
        countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
        // Toplam 10 pozitif sayı var.
        // Tüm negatif sayıların toplamı -65'tir.
​
        Notlar :
        Boş bir dizi verilirse, boş bir dizi döndürür: []
        0 pozitif değil.
​
    ************************************************************************
   */




