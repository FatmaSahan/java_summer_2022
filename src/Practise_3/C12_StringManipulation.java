package Practise_3;

import java.util.Scanner;

public class C12_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan bir kelime girmesini isteyin.
         Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
          kelimenin ortasindaki karakteri yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str= scan.next();
        if(str.length()>=3 && str.length()%2==1){
            System.out.println("ortanca karakter:"+str.charAt(str.length()/2+(1/2)));
            //ortanca karakter str.charat((str.lenght()-1)/2)
        }



        }


    }

