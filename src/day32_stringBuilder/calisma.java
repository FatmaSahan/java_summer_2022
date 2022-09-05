package day32_stringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calisma {
    static List<String> urunIismleriListesi=new ArrayList<>();
    static List<Double>  urunFiyatListesi=new ArrayList<>();
    static List<Integer>urunNoListesi  =new ArrayList<>();


    public static void main(String[] args) {

        String[] urunIismleri = {"Domates", "Patates", "Biber", "Sogan",
                    "Havuc", "Elma", "Muz  ", "Cilek", "Kavun", "Uzum", "Limon"};

        Double[] urunFiyatlar = {2.10, 3.20, 1.50, 2.30, 3.10,
                        1.20, 1.90 , 6.10 , 4.30 , 2.70 , 0.50 };

        int [] urunNo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <urunIismleri.length ; i++) {
            System.out.printf( "  %-3d  %-10s  %.2f  Tl\n", urunNo[i],urunIismleri[i],urunFiyatlar[i]);

        }
        for (int i = 0; i <urunIismleri.length ; i++) {
            urunIismleriListesi.add(urunIismleri[i]);

        }
        for (int i = 0; i <urunFiyatlar.length ; i++) {
            urunFiyatListesi.add(urunFiyatlar[i]);

        }
        for (int i = 0; i <urunNo.length ; i++) {
            urunNoListesi.add(urunNo[i]);
        }
        //listelere arraylerdeki elemanlari ekledik

        Scanner scan=new Scanner(System.in);
        System.out.println("istediginiz urunun nosunu giriniz");
        int urunnNo=scan.nextInt();
        double hesap=0;
        for (int i = 0; i <urunNoListesi.size() ; i++) {
            if (urunnNo==urunNoListesi.get(i)){
                System.out.println("Kac kg "+urunIismleriListesi.get(i) +" almak istersiniz");
                double kilo=scan.nextDouble();
                hesap=kilo*urunFiyatListesi.get(i);
                System.out.printf("  %.1fkg %-7s %.2f Tl dir",kilo,urunIismleriListesi.get(i),hesap);
            }

        }
    }}
