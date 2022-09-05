package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();
        try {
            if(yas<0){
          throw new IllegalArgumentException();

          }
          else
          System.out.println("yasiniz: "+yas);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("yas negatif olamaz");
        }
    }}
