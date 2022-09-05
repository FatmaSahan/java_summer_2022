package Practice_6;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicida x girilene kadar ekrana "program calisiyor" yazan ve xgirildiginde ise
        //"program' bitti yazan programi yaziniz
        Scanner abc=new Scanner(System.in);
        String okunan="";
        do {
            System.out.println("harf giriniz");
            okunan=abc.next();
            System.out.println("program calisiyor");

        }while (!okunan.equalsIgnoreCase("x"));

        System.out.println("program biti");
    }

}
