package day10_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class giris_calis {
    public static void main(String[] args) {
        System.out.println("hosgeldiniz okulumuza");

        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();


        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();

        System.out.println("yasinizi giriniz");
        Integer yas=scan.nextInt();

        scan.nextLine();

        System.out.println("Bransinizi giriniz");
        String brans=scan.nextLine();


        scan.nextLine();

        System.out.println("telefon nogiriniz");
        String tel=scan.next();
        scan.nextLine();

        ogretmenbilgileri_calis adayOgretmen=new ogretmenbilgileri_calis(isim,soyisim,yas,brans,tel);
        List<ogretmenbilgileri_calis> ogretmenlist=new ArrayList<>();
        ogretmenlist.add(adayOgretmen);
        System.out.println("ogretmenlist = " + ogretmenlist);


        //objeyi cagirirken kalibimizin klas ismini kullanik
       // obyeyede aday ogretmen ismini verdik ve souttada obje ismini yazarak yazdirdik
    }

}
