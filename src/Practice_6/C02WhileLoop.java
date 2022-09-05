package Practice_6;

import java.util.Scanner;

public class C02WhileLoop {
    public static void main(String[] args) {
        //girilen bir sayiiya kadar olan sayilardan sadece tek olanlarini ekrana
        //yazdiriniz.girilen sayi dahil(tek ise)
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int count=0;
        while (sayi>0){
            if (sayi%2==1){
                System.out.print(sayi);
                count++;
            }
            sayi--;

        }
        System.out.println(count);


}}
