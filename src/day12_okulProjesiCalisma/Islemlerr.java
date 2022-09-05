package day12_okulProjesiCalisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemlerr {



    static List<Kisi> ogrtmnList=new ArrayList<>();
    static List<Kisi> ogrnciList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;





   public static void girisBolumu(){
       System.out.println("====================================");
       System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
       System.out.println("====================================");
       System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
       System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
       System.out.println("Q- ÇIKIŞ");

       String secimm= scan.next().toUpperCase();

       switch(secimm){
           case "1":
               kisiTuru="Ogrenci";
               islemBolumu();
               break;
           case "2":
               kisiTuru="Ogretmen";
               islemBolumu();
           case "Q":
               break;
               default:
               System.out.println("hatali giris tekrar deneyiniz");
               girisBolumu();
               break;
       }
   }
   public static void islemBolumu(){
       System.out.println("Sectiginiz Bolum "+kisiTuru+" Bolumudur\n");

       System.out.println("============= İŞLEMLER =============\n" +
               "         1-EKLEME\n" +
               "         2-ARAMA\n" +
               "         3-LİSTELEME\n" +
               "         4-SİLME\n" +
               "         5-ANA MENÜ\n" +
               "         0-ÇIKIŞ");
       System.out.println("Lutfen bir islem seciniz");
       String secilenIslemm= scan.next().toUpperCase();

       switch (secilenIslemm){
           case "1":
              ekleme();
               islemBolumu();
               break;
           case "2":
               aramaa();
               islemBolumu();
               break;
           case "3":
              listele();
               islemBolumu();
               break;
           case "4":
               islemBolumu();
               sil();

               break;
           case "5":
               girisBolumu();
               break;
           case "Q":
               cik();
               break;
           default:
               System.out.println("Hatali giris.Tekrar deneyiniz");
               girisBolumu();
               break;
       }
   }
   private static void cik() {
        System.out.println("Okulumuza tekrar bekleriz.Hosca kalin");

    }
    private static void ekleme() {


        if(kisiTuru.equalsIgnoreCase("Ogrenci")){
            System.out.println(kisiTuru+" ekleme sayfasina hos geldiniz");
            System.out.println("isim ve soyisim giriniz");
            String isimSoyisim=scan.nextLine().toUpperCase();
            scan.nextLine();

            System.out.println("Kimlik numarasi giriniz");
            String kimlikNo=scan.nextLine();

            System.out.println("Yas giriniz");
            int yas= scan.nextInt();
            System.out.println("Ogrenci numarasini giriniz");
            String ogrnciNo=scan.nextLine().replaceAll(" ","");
            scan.nextLine();
            System.out.println("Sinif giriniz");
            String ogrenciSinif=scan.next().replaceAll(" ","");

            Ogrenci ogrnciBilgileri=new Ogrenci(isimSoyisim,kimlikNo,yas,ogrnciNo,ogrenciSinif);
            ogrnciList.add(ogrnciBilgileri);

        }else{
            scan.nextLine();
            System.out.println(kisiTuru+" ekleme sayfasina hos geldiniz");
            System.out.println("isim ve soyisim giriniz");
            String isimSoyisim=scan.nextLine().toUpperCase();
            scan.nextLine();

            System.out.println("Kimlik numarasi giriniz");
            String kimlikNo=scan.nextLine();

            System.out.println("Yas giriniz");
            int yas= scan.nextInt();


            System.out.println("Brans giriniz");
            String brans=scan.nextLine();

            System.out.println("Sicin no giriniz");
            String sicinNo=scan.nextLine().replaceAll(" ","");

            Ogretmen ogrtmnBilgiler=new Ogretmen(isimSoyisim,kimlikNo,yas,brans,sicinNo);
            ogrtmnList.add(ogrtmnBilgiler);
            System.out.println(ogrtmnList);


        }}

    private static void sil() {
        System.out.println(kisiTuru+" sil sayfasina hosgeldiniz");

        if (kisiTuru.equalsIgnoreCase("ogrenci")){
            System.out.println("Silinecek kisinin kimlik nosunu giriniz");
            String silinecekKimlikNo=scan.nextLine().replaceAll(" ","");
            for (Kisi each:ogrnciList
                 ) {if (silinecekKimlikNo.equals(each)){
                ogrnciList.remove(each);
                System.out.println(each.getIsimSoyisim()+" silindi");
            }else
                System.out.println("BU KIMLIK NUMARASINA AIT BIR KISI BULUNAMADIGI ICIN SILME ISLEMI GERCEKLESMEDI");

            }

        }else
            System.out.println("Silinecek kisinin kimlik nosunu giriniz");
        String silinecekKimlikNo=scan.nextLine().replaceAll(" ","");
            for (Kisi each:ogrtmnList
                 ) {if (silinecekKimlikNo.equals(each)){
                     ogrtmnList.remove(each);
                System.out.println(each.getIsimSoyisim()+" silindi");
            }
                System.out.println("BU KIMLIK NUMARASINA AIT BIR KISI BULUNAMADIGI ICIN SILME ISLEMI GERCEKLESMEDI");

            }


    }

    private static void listele() {
        System.out.println(kisiTuru+" listeleme sayfasina hosgeldiniz");
        if (kisiTuru.equalsIgnoreCase("ogrenci")){
            System.out.println("Ogrenci listesi :"+ogrnciList);
        }else
            System.out.println("Ogretmen Listesi :"+ogrtmnList);





    }

    private static void aramaa() {
        System.out.println(kisiTuru+" arama sayfasina hosgeldiniz");
boolean flag=true;

        if (kisiTuru.equalsIgnoreCase("ogrenci")){
            System.out.println("lutfen aradiginiz kisinin kimlik nosunu giriniz");
            String arananKimlikNo=scan.nextLine().replaceAll(" ","");
            for (Kisi each:ogrnciList
                 ) {
                if(each.getKimlikNo().equals(arananKimlikNo)){
                System.out.println("Aradiginiz ogrenci "+each.getIsimSoyisim());
                flag=false;
            }else {
                    System.out.println("Aranan tc ile ogrenci bulunamadi");
                }break;

        } }else
            System.out.println("lutfen aradiginiz kisinin kimlik nosunu giriniz");
        String arananKimlikNo=scan.nextLine().replaceAll(" ","");
        for (Kisi each:ogrtmnList
        ) {
            if (each.getKimlikNo().equals(arananKimlikNo)){
                System.out.println("Aradiginiz kisi " + each.getIsimSoyisim());
   }else {
                System.out.println("Aranan tc ile ogrenci bulunamadi");
            }
        }}}

