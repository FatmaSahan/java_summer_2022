package calisma;

import java.util.Scanner;

public class CaismaSayfam_3 {
    public static void main(String[] args) {
        /* SORU16 :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
                *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
                * indirim yapin
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("kac urun aldiniz");
        int adet=scan.nextInt();
        System.out.println("urunlerin fyati nedir");
        double fiyat=scan.nextDouble();
        double toplamFiyat=adet*fiyat;
        double yuzde20Indrm=toplamFiyat - (toplamFiyat / 5);
        double yuzde15Indrm=toplamFiyat-(toplamFiyat*15)/100;
        double yuzde10Indrm=toplamFiyat-(toplamFiyat*10)/100;

        System.out.println("musteri kartiniz varsa 1 i yoksa 2 yi tuslayin");

        int cevap=scan.nextInt();
        switch (cevap){
            case 1:
                System.out.println("var");
                if(adet>10){
                    System.out.println("odenecek tutar:"+yuzde20Indrm);}
                else {
                    System.out.println("odenecek tutar:"+yuzde15Indrm);}
                break;
            case 2:
                if(adet>10)
                {System.out.println("Odenecek tutar:"+yuzde15Indrm);}
                else {
                    System.out.println("odenecek tutar:"+yuzde10Indrm);}} /*soru16
         * SORU17: Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini
         * hesaplayin. 45 hiz siniridir. Eger hiziniz 55-74 arasinda ise: Ceza 100
         * $'dir.

         * Eger hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.

         * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.

         * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         *
         * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
         *
         * örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.

         * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * true;
         *
         * sonuc 320 olmalidir.
         *
         * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * false;
         *
         * sonuc 300 olmalidir.
         */
        System.out.println("hiziniz nedir");
        int hiz=scan.nextInt();
        System.out.println("ehlyetiniz varsa 1 i yoksa 2 yi tislayiniz");
        int ehliyetUygunlugu=scan.nextInt();
        switch (ehliyetUygunlugu) {
            case 1:
                System.out.println("var");
                if (hiz >= 55 && hiz <= 74)
                    System.out.println("ceza 100$");
                else if (hiz >= 75 && hiz <= 84) {
                    System.out.println("ceazaniz 150$");
                } else if (hiz >= 85 && hiz <= 94) {
                    System.out.println("cezaniz 320$");
                } else if (hiz > 94) {
                    System.out.println("cezaniz 500$");
                }
                break;

            case 2:
                System.out.println("yok");
                if (hiz >= 55 && hiz <= 74)
                    System.out.println("ceza 300$");
                else if (hiz >= 75 && hiz <= 84) {
                    System.out.println("ceazaniz 350$");
                } else if (hiz >= 85 && hiz <= 94) {
                    System.out.println("cezaniz 520$");
                } else if (hiz > 94) {
                    System.out.println("cezaniz 700$");
                }
                break;
        }









    }}
























