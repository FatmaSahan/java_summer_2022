package day08_ifStatement;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        //kullanicidan gun isminiyazmasini isteyin
        //gun ismi gecerli ise gecerli gunun  ilk uc harfi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
          String gun=scan.nextLine().toLowerCase();
        if (gun.equals("pazartesi")){
            System.out.println("paz");
        }else if(gun.equals("sali")){
            System.out.println("sal");
        }else if(gun.equals("carsamba")){
            System.out.println("car");
        }else if(gun.equals("persembe")){
            System.out.println("per");
        }else if(gun.equals("cuma")){
            System.out.println("cum");
        }else if(gun.equals("cumartesi")){
            System.out.println("cum");
        }else{
            System.out.println("lutfen gecerli bir gun ismi yaziniz");
        }
    }
}
