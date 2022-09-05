package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*eger bir classin icerisinde herhangi bir hesplama yapip bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin islemi bir method da yapip sonucu main methoda dondurebiliriz
        return type void olamayan bir methodun sonucunu main methoda bir variable a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */
        //kullanicidan sehir ismini ve dogumtarihini alip bunlari
        //programda kullanabilecegimiz formatta bize donduren bir method olusturalim
        //sehir ismini programimiza buyuk harf olarak
        //tarihi ise 2022_06-30 seklinde kullanmak istiyoruz

        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println("girdiginiz sehir:"+sehir);
        System.out.println("girdiginiz tarih:"+tarih);
    }
    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("sehir giriniz");
        String sehir= scan.nextLine();
        sehir=sehir.substring(0).toUpperCase();
         return sehir;//bu method sehir dondurecek
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();

        if (yil > 1900 && yil < 2100) {
            tarih = yil + "_";
        } else {
            System.out.println("yil icin gecerli bir sayi giriniz");
        }
        System.out.println("lutfen ay giriniz");
        int ay = scan.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.println("lutfen 1-12 arasi bir ay giriniz");

        } else if (ay < 10) {
            tarih =tarih +"0"+ ay + "-";

        } else {
            tarih = tarih + ay + "_";

        }
        System.out.println("lutfen tamsayi olarak gun giriniz");
        int gun = scan.nextInt();

        if (gun <= 0 || gun > 31) {

            System.out.println("lutfen gecerli 1-31 akadar bir sayi giriniz");

        } else if (gun < 10) {
            tarih =tarih + "0" + gun;
        }else
            tarih=tarih+gun;
        return tarih;  //bu method tarih dondurecek


    }}