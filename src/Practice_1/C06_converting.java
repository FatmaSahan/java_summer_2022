package Practice_1;

import java.util.Scanner;

public class C06_converting {
    public static void main(String[] args) {
        //soru1  gallonu litreye ceviren bir java programi yaziniz
       // 1 gallon =3.785 litre
        double gallon=1000;
        double litre=gallon*3.785;
        System.out.println("litre = " + litre);

        //soru2 kullanicidan iki sayi alin ve bunlari toplayip sonucunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz:");
        double sayi1= scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz:");
        double sayi2= scan.nextDouble();

        double toplam=(sayi1+sayi2);
        System.out.println("toplam="+toplam);


    }}

