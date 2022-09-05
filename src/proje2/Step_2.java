package proje2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static proje2.Step_1.*;

public class Step_2 {

    public static void main(String[] args) {
        uruunSec();


    }
    public static void uruunSec() {

        int cevap;
        do {

            System.out.println("lutfen almak istediginiz urunun nosunu giriniz");
            int numara= scan.nextInt();

            System.out.println(urunIismleriListesi.get(numara-1)+"  "+urunFiyatListesi.get(numara-1)+"£");

            sepetListesi.add(urunNoListesi.get(numara));
           genelToplam+=urunFiyatListesi.get(numara-1);
            System.out.println("alisverise devam etmek istiyorsaniz 1 i istemiyorsaniz 2 ye basiniz");
            cevap= scan.nextInt();

        }while(cevap==1);

        odeme();
    }

    public static void odeme() {

        int tahsilat=0;
        int toplamTahsilat=0;
        System.out.println("toplam tutar= "+genelToplam);
        System.out.println("lutfen odemeyi 1£ 5£ 10£ 15£ 20£ ile odeme yapiniz");

        do {
            tahsilat=scan.nextInt();
            toplamTahsilat=toplamTahsilat+tahsilat;
            if(toplamTahsilat<genelToplam){

                System.out.println("Yetersiz bakiye "+(genelToplam-toplamTahsilat)+" £ daha odemelisiniz");
            }

        }while (toplamTahsilat<genelToplam);//

        System.out.println("No\tUrun\t\tFiyat");
        for (int i = 0; i <sepetListesi.size() ; i++) {
            System.out.printf( "%2d  %-9s  %2d £\n",sepetListesi.get(i),urunIismleriListesi.get(sepetListesi.get(i)-1),urunFiyatListesi.get(sepetListesi.get(i)-1));
        }

        System.out.println("toplam tutar="+genelToplam+" £");
        System.out.println("odenen "+ toplamTahsilat+" £.Para ustu "+(toplamTahsilat-genelToplam));





    }


}










