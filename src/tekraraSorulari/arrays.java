package tekraraSorulari;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        /*Saati saniyeye çeviren java methodunu yazınız.

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
            7200
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen saat giriniz");
        double saat= scan.nextDouble();
        saniyeyeCevir(saat);


}public static double saniyeyeCevir(double saat) {
        double saniye=360*saat;
        System.out.println(saat+"saat "+saniye+" saniyedir");
        return saniye;
    }
}
