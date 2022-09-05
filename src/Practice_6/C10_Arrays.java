package Practice_6;

import java.util.Scanner;

public class C10_Arrays {
    public static void main(String[] args) {
        //STRING OLAN PIN KODUNUZU KONTROL EDEN BIR KOD YAZINIZ
        String pin="mehmet.1234";
        int girisHakki=3;
        Scanner scan=new Scanner(System.in);
        System.out.println("******HOSGELDINIZ******");
        while (true) {
            System.out.println("pin kodunu giriniz");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)) ;
            { System.out.println("basarili giris yaptiniz");
            break;
      //  }else{
      //  System.out.println("yanlis giris yaptiniz");}
      //  girisHakki--;}
       //     {System.out.println("kalan giris hakkiniz:"+girisHakki);}
      //  if (girisHakki==0){
        //    System.out.println("giris hakkiniz kalmadi..bloklandiniz");
           // break;
        }


        }
    }
}
