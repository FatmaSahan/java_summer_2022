package calisma;

import java.util.Scanner;

public class CalismaSayfam_4 {
    public static void main(String[] args) {
        /*SORU18
         * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
         * olanlarini konsola yazdiriniz int num1 int num2 int num3 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();

        if (sayi1 > sayi2 && sayi2 > sayi3) {
            System.out.println("en buyuk sayi " + sayi1 + " " + "en kucuk sayi " + sayi3);
        } else if (sayi1 > sayi3 && sayi3 > sayi2) {
            System.out.println("en buyuk sayi " + sayi1 + " " + "en kucuk sayi " + sayi2);

        } else if (sayi2 > sayi3 && sayi3 > sayi1) {
            System.out.println("en buyuk sayi " + sayi2 + " " + "en kucuk sayi " + sayi1);


        } else if (sayi2 > sayi1 && sayi1 > sayi3) {
            System.out.println("en buyuk sayi " + sayi2 + " " + "en kucuk sayi " + sayi3);

        } else if (sayi3 > sayi1 && sayi1 > sayi2) {
            System.out.println("en buyuk sayi " + sayi3 + " " + "en kucuk sayi " + sayi2);

        } else if (sayi3 > sayi2 && sayi2 > sayi1) {
            System.out.println("en buyuk sayi " + sayi3 + " " + "en kucuk sayi " + sayi1);
        } else System.out.println("lutfen sadece sayi giriniz");


        //SORU19: Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
//  bugun:pazartesi
        System.out.println("lutfen bir sayi giriniz");
        int gunSayi=scan.nextInt();

         int gunNo=gunSayi%7+1;
         System.out.print(gunSayi+" gun sonra gunlerden ");

        switch (gunNo) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
               break;
            case 7:
                System.out.println("pazar");
                break;

        }

      /*SORU21:  Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
                tamkare ise true  değilse false yazdırınız.
                Not: sqrt gibi fonksiyonları  kullanmayın.
        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16
        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25
        Example 3:
        Input: 14
        Output: false
       */
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        sayi1=Math.sqrt(sayi);
        System.out.println(sayi1);

        if(sayi==sayi1*sayi1){
            System.out.println(" sayi tam karedir");
        }else System.out.println("tam kare degildir");

















   /*SORU_22
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.
        İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
       Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.
      son olarak konsolda: Frankfurt 15 Euro         yazsın.
       case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.
       son olarak konsolda:  Köln   20 Euro             yazsın.
       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)
        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
          Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */


    }}
