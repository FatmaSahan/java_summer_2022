package recap02Elif;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        //bir iscinin isi bitirme suresini ve toplam isci sayisini alarak
        //isin bitme suresini hesaplayan kodu yaziniz
        //ornegin:bir isci bir isi 10 gunde yapabilmektedir
        //buna gore 2 isci ayni isi kac gunde yapar?
        Scanner scan=new Scanner(System.in);
        System.out.println("bir iscinin isi bitirme suresi nedir?");
        double sure=scan.nextDouble();
        System.out.println("toplam isci sayisi nedir");
        int isciSayisi=scan.nextInt();

        double bitisSuresi=(sure/isciSayisi);
        System.out.println("isin bitis suresi="+bitisSuresi+"gun");


    }
}
