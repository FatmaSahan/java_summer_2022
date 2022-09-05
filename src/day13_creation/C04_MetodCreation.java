package day13_creation;

import static day15_overloading_Forlop.C03_Overloading.topla;

public class C04_MetodCreation {
    public static void main(String[] args) {

       //input olarak verilen 2 integere toplayip sonucunu yazdiran method olusturalim
        int input1=10;
        int input2=20;
        //method 4 adimda olusturulur
        //1. adim: method call
        //2. adim:argument eklenmesi gerekiyorsa ekleyelim
        //3.adim:eger methodun return typi voidden frakli olacaksa bir vriable olusturup method call a assign edelim

        topla(input1,input2); //method call //icindekiler argumentler
    }
    private static void topla(int input1,int input2){
        System.out.println("girilen iki sayinin toplami:"+(input1+input2));


    }

    }

