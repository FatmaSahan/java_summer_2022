package Practice_6;

import java.util.Scanner;

public class C08_Arrays {
    public static void main(String[] args) { /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        int[] arr=new int[8];
        Scanner oku=new Scanner(System.in);
        int count=0;
        for (int i = 0; i < arr.length; i++) {//index olarak yaptigimiz icin 0 dan baslattik
            System.out.println(i+".indexteki sayiyi giriniz:");
            arr[i]=oku.nextInt();
            if(arr[i]%3==0){
                count++;

            }

        }
        System.out.println("3 e bolunebilen sayi adedi:"+count+" tur");



    }
}
