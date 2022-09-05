package day08_ifStatement;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args){
        //Kullanicidan 100 uzerinden notunu isteyin.
// Not'u harf sistemine cevirip yazdirin.
// 0<=not<50 ise  "D",
// 50<=not<60 ise "C";
// 60<=not<80 ise "B",
// 80<=not<100ise "A" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 0 dan 100 e kadat bir not giriniz");
        Double Not=scan.nextDouble();

        if (Not<0||Not>100) {
            System.out.println("lutfen gecerli bir not giriniz");
        }else if(Not<50) {
            System.out.println("not:D");
        }else if(Not<60){
            System.out.println("not:C");
        }else if(Not<80){
            System.out.println("not:B");
        }else if(Not<100){
            System.out.println("not:A");










































































































































        }
    }
}
