package day18_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
       // ve baslangic harfinden baslayip bitis harfinde biten
       // tum harfleri buyuk harf olarak ekrana yazdirin.
        // Kullanicinin hata yapmadigini farz edin.


        char ilkHarf='a';
        char sonHarf='e';
        char themp=ilkHarf;
        String buyult="";

        while (themp<=sonHarf){
            buyult=(themp+"").toUpperCase();//thempin yanina hiclik yni strong getirince "to uppercase "calisi

            System.out.print(buyult+" ");
            themp+=1;


    }}
}
