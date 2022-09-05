package calisma;

import java.util.Scanner;

public class CalismaSayfam_2 {
    public static void main(String[] args) {
         /* SORU12
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("isci sayisi ve bir iscinin isi bitirme suresini giriniz");
        int isciSayisi = scan.nextInt();
        int birisciSuresi = scan.nextInt();//bir isci kac gunde bitiriyor
        int bitisSuresi = (isciSayisi / birisciSuresi);
        System.out.println(isciSayisi + " isci " + "bu isi " + bitisSuresi + " gunde bitirir");

        /*SORU13
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort
         * islemden biri ile isleme koyup sonucun yazdiriniz
         */
        System.out.println("lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        double toplama = sayi1 + sayi2;
        double cikarma = sayi1 - sayi2;
        double carpma = sayi1 * sayi2;
        double bolme = sayi1 / sayi2;
        System.out.println("lutfen dort islemden birini seciniz");
        int islemNo = scan.nextInt();
        switch (islemNo) {
            case 1:
                System.out.println(toplama);
                break;
            case 2:
                System.out.println(cikarma);
                break;
            case 3:
                System.out.println(carpma);
                break;
            case 4:
                System.out.println(bolme);
                break;
            default:
                System.out.println("dort islemden birini seciniz");
        }
        /*soru14
         * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
         * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
         * durumunu da kontrol edniz
         *
         * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
         * herhangi iki kenar farkı diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c
         * b+c>a>b-c a=b=c ise es kenar ucgen
         */
        System.out.println("3 tamsayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


         if((a + b < c && a - b > c) || (b + c < a && b - c >a) || (a + c < b && a - c > b))
             {
                 System.out.println("ucgen olusurmaz");
             }else if(a==b&&b==c){
                 System.out.println("eskenar ucgen olusur");
             }else
                 System.out.println("ucgen olusmaz");
         /*soru15
                  * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
                  * hatali giris seklinde kod yazniz
                  */
        char harf='%';//SCANERDAN CHAR NASIL ALMALIYIZ HOCAYA SOR

        if(harf>='a'&&harf<='z'){
            System.out.println("girdiginiz harf kucuk harftir");
        } else if (harf>='A'&&harf<='Z') {
            System.out.println("girdiginiz harf buyuk harftir");

        }else System.out.println("lutfen harf giriniz");





        }}



