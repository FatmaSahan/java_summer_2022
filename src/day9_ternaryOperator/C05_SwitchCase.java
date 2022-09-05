package day9_ternaryOperator;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        //KULLANICIDAN GUN ISMI AL
        //1. GUNU PAZARTESI
        //7. GUNU PAZAR YAZDIR
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacinci gun oldugunu giriniz"); //switch yanina yazilan() noya gore case ataycagimizi gosterir
        //java girilen degere gore casi' i bulur o satirdan calistirmaya baslar
        //break yazisi gorunce veya switch parantezine kadar devam eder
        //if else if....else yapisinda oldugu gibi hicbirsarta uymanlar icin default kullanilir


        int gunNo=scan.nextInt();
        switch(gunNo){
                case  1:
                System.out.println("pazartesi");
                break;
                case  2:
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
            default:
                System.out.println("gecerli gun numarasi giriniz");


}}}
