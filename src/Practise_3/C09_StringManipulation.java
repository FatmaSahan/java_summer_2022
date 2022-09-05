package Practise_3;

import java.util.Scanner;

public class C09_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
        //Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
        // Output : Cesaret insana sinirlarini ogretir.//ilkkelime buyukolsun
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 kelime giriniz");
        String kelime1=scan.next();
        String kelime2=scan.next();
        String kelime3=scan.next();
        String kelime4=scan.next();
        kelime1=kelime1.substring(0,1).toUpperCase().concat(kelime1.substring(1).toLowerCase());
        kelime2=kelime2.toLowerCase();
        kelime3=kelime3.toLowerCase();
        kelime4=kelime4.toLowerCase();
        String fulcumle=kelime1+" "+kelime2+" "+kelime3+" "+kelime4+".";
        System.out.println(fulcumle);



    }
}
