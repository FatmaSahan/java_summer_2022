package calisma;

import java.util.Arrays;
import java.util.Scanner;

public class CO1 {
    public static void main(String[] args) {

        String str5 = "fatma sahan";

        str5= str5.replaceAll(" ","");//fatmasahan
        System.out.println(str5);
        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN BIR INDEX GIRINIZ");
        int sayi= scan.nextInt();

        for (int i = 0; i <str5.length() ; i++) {
            if (sayi == i) {
            } System.out.println(str5.substring(i, i + 1));

    }}}


