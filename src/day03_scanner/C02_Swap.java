package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
                 sayi1 = 10;
                  sayi2 = 20    kodtan sonra

               sayi1 =20
               sayi2 =10 ols
      */

                int sayi1 =10;
                int sayi2 =20;
                int sayi3 = 0;

         sayi3=sayi2;
         sayi2=sayi1 ;
         sayi1=sayi3;

        System.out.println(" swap'tan sonra sayi1:"+ sayi1);
        System.out.println(" swap'tan sonra sayi2:"+ sayi2);
    }
}
