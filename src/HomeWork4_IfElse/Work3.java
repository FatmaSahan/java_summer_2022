package HomeWork4_IfElse;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        //kullanicidan bir karakter isteyin ve bunun harf olup plmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);

        if((harf>='a'&& harf<='z')){
            System.out.println("harftir");
        }else{
            System.out.println("harf degildir");
        }
    }
}
