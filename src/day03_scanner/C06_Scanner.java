package day03_scanner;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // kullanicidan isim soyisim ve yasini al
        //Girilen bilgiler=fatma sahin 36 seklinde yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next();

        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.next();

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("Girilen bilgiler="+isim+" "+soyisim+" "+yas);
    }
}
