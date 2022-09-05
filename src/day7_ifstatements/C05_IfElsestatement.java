package day7_ifstatements;

import java.util.Scanner;

public class C05_IfElsestatement {
    public static void main(String[] args) {

        //kullanicidan bir karakter isteyin ve bunun harf olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz:" );
        char harf=scan.next().charAt(0);

                if((harf>='a'&& harf<='z')||(harf>='A' && harf<='Z'))
                {

                    System.out.println("girilen karakter bir harftir");
                }
                else {
                    System.out.println("girilen karakter harf degildir");}


    }
}
