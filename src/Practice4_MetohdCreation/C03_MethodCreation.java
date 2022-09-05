package Practice4_MetohdCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    //SORU:kullanicidan alinan bir tamsayi kadar(47 den kucuk) fibonacci dizisi olusturun
//0 1 1 2 3 5 8 13 21 34...........

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//10 girebirsin
        System.out.println("47 den kucuk bir tamsayi giriniz :");
        int sayi = scanner.nextInt();
        fibonacci(sayi);
    }
    private static void fibonacci(int sayi) {
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;
        System.out.print(sayi1 + " ");
        System.out.print(sayi2 + " ");
        if(sayi<47){
            for (int i=2; i<sayi; i++){
                sayi3 = sayi1 + sayi2;
                System.out.print(sayi3 + " ");
                sayi1 =sayi2;
                sayi2= sayi3;
            }
        }else System.out.println("47 den kucuk bir sayi giriniz..");


    }
}
