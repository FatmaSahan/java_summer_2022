package day9_ternaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin..sayi pozitifse sayi poziftir
        //negatifse sayinin karesini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi= scan.nextDouble();
        //eger ternary icindeki sonuclar farkli data turlerinde ise atama yapamayiz sadece souta yazdirabiliriz
        //POZITIF SAYI IFADESI>STRINGTIR
        //SAYI*SAYI>DOBLE

        System.out.println(sayi>0?"Sayi pozitif":(sayi*sayi));



    }
}
