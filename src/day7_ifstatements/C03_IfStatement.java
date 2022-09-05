package day7_ifstatements;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //kullanicidan bir gun isteyiniz ve bu gunun hafta ici yada haftasonu yazdiriniz
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir gun ismi giriniz:");
        String girilenGun=scan.next().toLowerCase();
        if (girilenGun.equals ("pazar")||girilenGun.equals("cumartesi"))
        {
            System.out.println("  Girilen Gun Hafta Sonu");
        }
        if (girilenGun.equals("pazartesi")
                ||girilenGun.equals("sali")
                ||girilenGun.equals("carsamba")
                ||girilenGun.equals("persembe")
                ||girilenGun.equals("cuma"))
        {
            System.out.println("girilen gun hafta icidir");
        }
        if(!(girilenGun.equals ("pazar")
                ||girilenGun.equals("cumartesi")
                ||girilenGun.equals("pazartesi")
                ||girilenGun.equals("sali")
                ||girilenGun.equals("carsamba")
                ||girilenGun.equals("persembe")
                ||girilenGun.equals("cuma"))) {
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }


    }
}
