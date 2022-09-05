package day08_ifStatement;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {
        //kullanicidan bir yil al
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
        int yil = scan.nextInt();
        if (yil % 4 != 0) {
            System.out.println("artik yil degildir");
        } else if (yil % 100 != 0) {
            System.out.println("artik yildir");
        } else if (yil % 400 != 0) {
            System.out.println("artik yil degildir");
        } else {
            System.out.println("artik yildir");
        }
    }}