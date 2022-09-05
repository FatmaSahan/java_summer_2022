package day15_overloading_Forlop;

public class C04_OverLoading {
    public static void main(String[] args) {
        topla(5,7); //int int
        topla(5.2,3);//doble int
        topla(3.4,6.1);//double double
        topla(5,6.2);// asagida int double yok ama int double sigdigi icin double double olaraktoplar//11.2 yazdirir
        //java hangi methodun calisacagina karar verirken optimizasyon yapar
        //hic "cast "yapmadan kullanabilecegi method varsa ilk onu tercih eder
        //yoksa en az "cast" yapacagini tercih eder
    }
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integeren toplami:"+(sayi1+sayi2));
    }
    public static void topla(double sayi1,int sayi2){
        System.out.println("double bir sayi ile int bir sayinin toplami:"+sayi1+sayi2);
    }
    public static void topla(double sayi1,double sayi2){
        System.out.println("iki double  sayinin toplami:"+(sayi1+sayi2));

    }public static void topla(int sayi1,int sayi2, double sayi3){

    }


}
