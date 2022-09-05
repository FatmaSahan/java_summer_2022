package Practise_3;

import java.util.Scanner;

public class C08_StringManipulation {
    public static void main(String[] args) {
        //kulllanicidan bir kelime isteyin.eger kelime 3 yada daha fazla harften olusuyorsa
        //son iki harfini 3 kere yanyana yazdirin
        //degilse girilen kelimeyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kelime giriniz");
        String KELIME=scan.next();

        if(KELIME.length()>=3){
            System.out.println(KELIME.substring(KELIME.length()-2)+KELIME.substring(KELIME.length()-2)+
                    KELIME.substring(KELIME.length()-2));

        }else{
            System.out.println(KELIME);
        }


            }
        }


