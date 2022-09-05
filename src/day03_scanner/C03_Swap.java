package day03_scanner;

public class C03_Swap {
    public static void main(String[] args) {
        //sayi1=10 sayi2=20 olsun sayi1=20 sayi2=10 yapalim

        int sayi1=10 ;
        int sayi2=20;
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("swaptan sonra sayi1:"+sayi1);
        System.out.println("swaptan sonra sayi2:" +sayi2);

    }
}
