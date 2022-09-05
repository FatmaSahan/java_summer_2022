package calisma;

public class C02 {
    public static void main(String[] args) {/*  Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10


      */
        int sayi=6;
        int sayi1=4;
        int fark=sayi-sayi1;

        for (int i = sayi-1; i >=1 ; i--)
        {sayi*=i;}

            for (int j = sayi1-1; j >=1 ; j--)
            {sayi1*=j;}

                for (int k =fark-1; k >=1; k--)
                {fark*=k;}
        System.out.println("n!/(n-r)!*r!="+sayi/(fark*sayi1));

    }}






