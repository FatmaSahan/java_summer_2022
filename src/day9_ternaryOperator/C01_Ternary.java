package day9_ternaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN BIR SAYI GIRINIZ");
        double sayi= scan.nextDouble();

        System.out.println(sayi>=0?sayi:-1*sayi);


    }
}
