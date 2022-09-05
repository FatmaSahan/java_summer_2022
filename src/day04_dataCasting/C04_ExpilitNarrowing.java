package day04_dataCasting;

public class C04_ExpilitNarrowing {
    public static void main(String[] args) {

        // double int a atamak gibi
        //sigadabilir sigmayadabilir
        // denemeliyiz
        // sinirlari kadar alabilir

        int sayi1=50;
       // byte sayi2=sayi1;     // sinyal verir /casting yapar /risk almakistemez

          byte sayi2=(byte)sayi1;
        System.out.println(sayi2);

       // int sayi1=500;
       // byte sayi2=sayi1;
        System.out.println(sayi2);

    }
}
