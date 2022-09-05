package day17_nestedForLoop;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamakicin sayilar alin
        //sayilarin toplami 500 ve 500 u gecince sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin
        //13 sayi girdiniz ve toplamlari 567 gibi....

        int toplam=0;
        int sayi=0;
        int sayac=1;

        Scanner scan=new Scanner(System.in);
        while (toplam<500){
        System.out.println("lutfen toplamak icin sayi giriniz");
        sayi= scan.nextInt();
        toplam+=sayi;
        sayac++;

    }
        System.out.println(sayac+"sayi girdiniz ve toplamlari"+toplam);
}}
