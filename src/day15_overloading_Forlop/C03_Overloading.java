package day15_overloading_Forlop;

public class C03_Overloading {
    public static void main(String[] args) {
        topla(5,7);
        topla(5.2,3);
        topla(3.4,6.1);
        topla(5,6.2);

    }
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integeren toplami:"+(sayi1+sayi2));
    }
        //bir classda ayni isimde("topla")ayni parametre sayisinda ve ayni data turunde  ayni anda
        // iki method olusturamayiz..asagida oldugu gibi..

       // public static void topla(int sayi3,int sayi4)

       // System.out.println("bir int ve bir double  sayinin toplami:"+(sayi1+sayi2));
    public static void topla(double sayi1,int sayi2){
        System.out.println("double bir sayi ile int bir sayinin toplami:"+sayi1+sayi2);
    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("int bir sayi ile double bir sayinin toplami:"+sayi1+sayi2);
    }

    public static void topla(double sayi1,double sayi2){
        System.out.println("iki double  sayinin toplami:"+(sayi1+sayi2));
        //java hangi metodun calisacagina karar verirken optimizasyon yapar.en az islemle islem yapmayi ongurur
        //en az cast yaparak kullanancagi metodu terciheder

    }
}
