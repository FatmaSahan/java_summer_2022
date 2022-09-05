package Practise_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CALISMA {
    public static void main(String[] args) {

        //hacer sorusu

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();

        String[] arr=new String[cumle.length()];//array olusturduk sira elemnlari atamakta
        for (int i = 0; i <cumle.length() ; i++) {
            arr[i]=cumle.substring(i,i+1);//arrayi elemnlariyla olusturduk

             if(arr[i].equals("s")){

                arr[i]="5";

            }if (arr[i].equals("a")){

                arr[i]="4";

            }if (arr[i].equals("e")){

                arr[i]="3";

            }if (arr[i].equals("i")){

                arr[i]="1";

            }if(arr[i].equals("o")){

                arr[i]="0";
            }
            System.out.print(arr[i]);
            }
        System.out.println(" ");

        //maymun sorusu
        int muzsayisi=165;
        int yasadigigunSayisi=0;
        boolean maymunhayattami=true;
        while (maymunhayattami){
               muzsayisi-=4;
              yasadigigunSayisi++;

            if(muzsayisi<4){
                maymunhayattami=false;
            }

        }
        System.out.println("maymun "+yasadigigunSayisi+" gunun sonunda olur");

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // 1 nolu ogrencinin 7 dogru cevabi var.
        // 2 nolu ogrencinin 6 dogru cevabi var.


        for (int i = 0; i <answers.length ; i++) {
            int sayac=0;

            for (int j = 0; j <answers[i].length ; j++) {
                if(answers[i][j]==keys[j]){
                    sayac++;
                }

            }
            System.out.println(i+1+" nolu ogrencinin "+sayac+" dogrusu vardir");

        }

        //array sorusu /*
        //    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        //    verilen Array icinde
        //    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
        //    */

        int array [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7},{3,5,7,7,88}};

        eelemanSayisi(array);
        System.out.println("eleman sayisi(array)"+eelemanSayisi(array));
    }
    public static int eelemanSayisi(int[][] array) {
        int sayac=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                sayac++;
            }
        }

        return sayac;


        //hacer sorus






    }

}
