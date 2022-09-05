package day15_overloading_Forlop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        //input olarak verilen bir tamsayi icin faktoriyel hesaplayip yazdiran bir metod olusturun
        //verilen sayi negatif veya 20 den buyukse "grilen sayinin faktoriyeli hesaplanamaz" yazdiran methodolusturun

        int input=-6;
        faktoriyelHesapla(input);
        //faktoriyeli 0 dan kucuk alamayiz .int oldugu icin 20 ninde uzerini hesaplayamaz
        //0!=1 dir

    }

    public static void faktoriyelHesapla(int input) {
           int faktoriyel=1;

        if(input<0||input>20){
            System.out.println("faktoriyeli hesaplanamaz");

        } else if (input==0) {
            System.out.println("0!=1");

        }else{ for (int i = 1; i <=input ; i++) {  //"DIKKAT";;ust sinir inputu aldik dikkat et

            faktoriyel*=i;  }

            System.out.println("faktoriyel="+faktoriyel);

        }

    }}

