package day22_multiDimensenalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        //verilen bir multi dimensional arrayin
        // tum elementlerini yazsdiran bir metod olusturun
        //tek katli arraylerde arrayi direk yazdiramayiz.cunku array non primitive datturudur ve
        //non primitiveler direk yazdirilmayabilir
        //fakat arrayin icindeki elementi direk yazdirabiliriz
        //multi dimensional arraylerde dikkat etmemeiz gereken sey
        //ulasmak istedigimiz elementin bir array mi yoksa primitive data turumu oldugudur

        int[][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};//2 susluparantez var 2 koseliparantez
        System.out.println(sayilar[0]);//referans verir//[I@48140564
        System.out.println(Arrays.toString(sayilar[0]));//[1, 5, 6, 9]

        System.out.println(sayilar[0][1]);//5
        System.out.println(sayilar[1][0]);//2
        System.out.println(sayilar[2][2]);//6
        //tum arrayi yazdiralim
        System.out.println(Arrays.deepToString(sayilar));//[[1, 5, 6, 9], [2, 5], [3, 1, 6]]//

        // 3 olursa 3 olu
        //arrayi iki sekilde declare edebiliriz

        //1.int[][] sayilar = {{1,5,6,9},{2,5},{3,1,6}}//elemanlari direk yazdirabiliriz


        //2.outer ve iner arraylerin uzunluklarini belirterek yazbiliriz
        int [][] sayilar1=new int[3][2];//{{0,0},{0,0},{0,0}}
        //tek tek elemanlari atyabiliriz fakt bu zordur

        sayilar1[0][0]=2;
        sayilar1[0][1]=4;
        sayilar1[1][0]=6;
        sayilar1[1][1]=8;
        sayilar1[2][0]=5;
        sayilar1[2][1]=1;
        System.out.println(Arrays.deepToString(sayilar1));




    }
}
