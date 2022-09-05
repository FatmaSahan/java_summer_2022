package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydir {
    public static void main(String[] args) {

        // Soru 1: Verilen 3 elemanli bir array’in
        // tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

         int arr[]={1,2,3};
         int temp=arr[0];//1
        for (int i = 0; i< arr.length-1 ; i++) {
            arr[i]=arr[i+1];//0. index 1 inci indexi //1. indexe 2. indexi atadik
            // 2. indexede tempi atamaliyiz

        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));//{2,3,1}

        // ilk durumuna getirmek icin saga kaydiralim
        //int arr[]={1,2,3}
        temp=arr[arr.length-1];//son elemani korumaya aldik//en son bunu ataycaz
        for (int i = arr[arr.length-1];  i>0 ; i--) {
            arr[i]=arr[i-1];

        }arr[0]=temp;
        System.out.println(Arrays.toString(arr));



    }}

