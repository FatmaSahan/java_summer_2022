package recap02Elif;

import java.util.Scanner;

public class C03BMISiniflama {
    public static void main(String[] args) {
        //kullanicidan boyunu cm kilosunu kg olarak alin ve BMI(VKE) hesaplayiniz
        //ornegin:
        //BMI=KG/BOY*BOY
        //BMI<=20 ISE ZAYIF
        //20<BMI<=25 NORMAL
        //25<BMI<=30 SISMAN
        //BMI>30  OBEZ
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble()/100;//BOYU CM 100 E BOLEREK CEVIRDIK
        double BMI=kilo/(boy*boy);
        if(BMI<=20){
            System.out.println("zayifsiniz");
        } else if (BMI>20&&BMI<=25) {
            System.out.println("normal kilodasiniz");

        } else if (BMI>25&&BMI<=30) {
            System.out.println("sismansiniz");

        } else if (BMI>30) {
            System.out.println("obezsiniz");

        }
    }
}
