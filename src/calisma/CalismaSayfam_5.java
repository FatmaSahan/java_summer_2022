package calisma;

import java.util.Scanner;

public class CalismaSayfam_5 {
    public static void main(String[] args) {
        /*SORU23
     * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
     * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
     * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
     * harfi büyük yada küçüklüğüne duyarlıdır.)
     *
     * Sesli harfler: a,e,i,o,u
     *
     * Test Data: a
     *
     * Beklenen Çıktı: a harfi sesli harfdir.
     *
     * Test Data: d
     *
     * Beklenen Çıktı: d harfi sesiz harftir.
     *
     * Test Data: we yada %
     *
     * Beklenen Çıktı: Yanlis karakter girdiniz!
     *
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        if(!((harf>='a'&&harf<='z')||(harf>='A'&&harf<='Z'))) {
            System.out.println("lutfen  sadece harf giriniz");
        } else if (((harf=='a'||harf=='e'||harf=='o'||harf=='u'||harf=='i'))||
                    ((harf=='A'||harf=='E'||harf=='O'||harf=='U'||harf=='I')))
    {
            System.out.println("girilen harf sesli harftir");

        }else System.out.println("girilen harf sessiz harftir");
         /*SORU24
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et
        */


        mukemmelSayi();


    }
    public static void mukemmelSayi(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int toplam=1;
        int sayi= scan.nextInt();

        for (int i =2; i <sayi-1 ; i++) {
            if(sayi%i==0){
                toplam+=i;}}
        System.out.println(toplam);
                        if(toplam==sayi){
                            System.out.println("bu sayi mukemmel sayidir");
                        }else {System.out.println("mukemmel sayi degildir");}


            }


        }















