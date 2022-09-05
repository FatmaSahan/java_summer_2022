package Practice4_MetohdCreation;

public class C04_MethodCreation {
    //100 den 0 a kadar 13 e bolunebilen sayilari
    // yazdiriniz(buyukten kucuge).ayrica bi sayilarin toplamiida yazdirin
    public static void main(String[] args) {
int toplam=0;
        for (int i =100; i >0 ; i--) {
            if(i%13==0)
            {System.out.print(i+" ");


                toplam+=i;}



        }
        System.out.println("");

        System.out.println("13 ile bolunen sayilarin toplami "+toplam);





    }}

