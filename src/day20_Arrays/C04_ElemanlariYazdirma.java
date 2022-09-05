package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6,7};
        // array'in tamamini yazdiralim
        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7]//arrrayi yazdik
        // array'in tum elementlerini yazdirin
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(sayilar[i]+" ");//1 2 3 4 5 6 7 bu sekilde yazdirir
            //yada
            for (int j = 0; j <sayilar.length ; j++) {
                if(j !=sayilar.length-1){
                    System.out.print(sayilar[j]+",");
                }else
                System.out.print(sayilar[j]);//1,2,3,4,5,6,7//arrayin elementlerini yazdik

            }

        }

        }

    }

