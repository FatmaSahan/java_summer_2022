package Practise_3;

import java.util.Scanner;

public class C10_StringMenipulation {
    public static void main(String[] args) {
        // girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yazin
        // xyz    ==   true
        //x.yz   ==   false
        //xyaz   ==   false
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scan.nextLine();

        System.out.println(xyzVarmi(str));
    }

    private static boolean xyzVarmi(String str) {
        if(str.contains("xyz")){
            return true;
        }else
            return false;

    }


}
