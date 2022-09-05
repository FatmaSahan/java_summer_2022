package recap02Elif;

import java.util.Scanner;

public class C04_KanBagisiYasAraligi {
    public static void main(String[] args) {
        //kullanicidan yasini ve kilosunu aliniz
        //18 yasindan kucukse kan bagisi yapamaz
        //18 yasindan buyukse ve 50 kilodan hafifse kan bagisi yapamaz
        //18 yasindan buyuk ve 50 kiladan agirsa kan bagisi yapabilir
        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("kilonuzu giriniz");
        double kilo=scan.nextDouble();
        if(yas>0&&yas<18){
            System.out.println("kan bagisi yapamaz");
            // ic ice if sartlari koyarak nested yaptik asagida
        } else if (yas>=18) {
            if(kilo<50){
                System.out.println("kan bagisi yapamaz");
            } else if (kilo>=50) {
                System.out.println("bagis yapabilir");

            }

        }
    }
}
