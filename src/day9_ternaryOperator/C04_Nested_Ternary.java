package day9_ternaryOperator;

import java.util.Scanner;

public class C04_Nested_Ternary {
    public static void main(String[] args) {
        //kullanicidan bir harf alin
        //buyuk harfse consola "Buyuk harf"
        //kucuk harfse kucuk harfse consola "kucuk harf"
        //buda degilse "girdiginiz karakter harf degildir" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        String sonuc1=(harf>='a' && harf<='z') ? ("Kucuk harf"):
                ((harf>='A'&& harf<='Z') ? ("Buyuk harf"):("Gecersiz karakter "));
        String sonuc2=harf>='A' && harf<='Z' ? "Buyuk harf" :
                ((harf>='a' && harf<='z'))? ("Kucuk harf"):("Gecersiz karakter");
        System.out.println(sonuc1);
        System.out.println(sonuc2);
    }
}
