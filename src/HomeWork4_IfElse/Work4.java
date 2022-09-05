package HomeWork4_IfElse;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        //kullanicidan bir ucgenin uc kenar uzunlugunu alin
        //eger uc kenar uzunlugu birbirine esitse" eskenar ucgen"
        //degilse "eskenar degil "yazdirin Scanner scan=new Scanner(System.in);

    Scanner scan=new Scanner(System.in);
        System.out.println("lutfen uc  tane sayi giriniz");

         double sayi1=scan.nextDouble();
         double sayi2=scan.nextDouble();
         double sayi3=scan.nextDouble();

         if(sayi1==sayi2&&sayi2==sayi3){
             System.out.println("Eskenar Ucgendir");
         }else{
             System.out.println("Eskenar Degildir");
         }
       }
    }
