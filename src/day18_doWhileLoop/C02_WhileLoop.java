package day18_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi isteyin ve rakmlar toplamini yazdirin

        int input=5432;
        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;
        while (temp>0){ // input 0 dan buyuk oldugu surece calis
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;

        }
        System.out.println(input+" "+"sayisinin rakamlr toplami:"+rakamlarToplami);

    }
}
