package Practice_1;

import java.util.Scanner;

public class C07_Tekrar {
    public static void main(String[] args) {
        //kullanicida isim,memleket,su anki konum,yas,boy, soran bir program yazdirin
        //yasadiklari yeri seviyorlarsa bu bilgiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.print("isminiz:");
        String isim= scan.nextLine();

        System.out.print("memlekatiniz:");
        String memleket= scan.nextLine();

        System.out.print("su anki konumunuz:");
        String konum= scan.nextLine();

        System.out.print("yasiniz:");
        double yas= scan.nextDouble();

        System.out.print("boyunuz:");
        double boy= scan.nextDouble();

        System.out.print("memleketini seviyormusun tru/false yaz:");
        boolean seviyormu= scan.hasNext();

        System.out.println("isim:" +isim);
        System.out.println("memleketiniz:"+ memleket);
        System.out.println("konumunuz:"+konum);
        System.out.println("yasiniz:"+yas);
        System.out.println("boyunuz:"+boy);
        System.out.println("seviyormu:"+seviyormu);




    }
}
