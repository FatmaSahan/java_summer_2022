package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //Verilen bir array'deki tekrar eden elementleri silip
// tekrarsiz halini Array'e atayan bir kod yaziniz.
        int[] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        //set kume mantigidir her elemn tektir
        Set<Integer> tekrarasizSet=new HashSet<>();//sette index yok
        for (int each:arr
             ) {tekrarasizSet.add(each);//her bir elemani sete attik fakat set bunlardan sadece burar tane aldi

        }
        System.out.println(tekrarasizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] tekrarsizArr=new int[tekrarasizSet.size()];//arrayde index var
        int i=0;
        for (Integer each:tekrarasizSet
             ) {tekrarsizArr[i]=each;
            i++;

        }

        System.out.println(Arrays.toString(tekrarsizArr));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr =tekrarsizArr;
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]



    }

    }

