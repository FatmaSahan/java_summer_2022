package Replit_Sorulari;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi soyisminizi ve card numaranizi giriniz");
       String isim=scan.nextLine();
       String soyisim=scan.nextLine();
       String kartNo=scan.nextLine();
       isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*");
       soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
       if(kartNo.length()==16)
            kartNo=kartNo.substring(0,kartNo.length()-4).replaceAll("\\w","*")+
                kartNo.substring(kartNo.length()-4);
       if (kartNo.length()!=16){
           System.out.println(isim+" "+soyisim+"  lutfen 16 haneli bir kart numarasi giriniz");
       }else

        System.out.println(isim+" "+soyisim+" "+kartNo);




        }

    }

