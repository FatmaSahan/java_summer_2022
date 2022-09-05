package day17_nestedForLoop;

public class C05_NestedForLoopDIKKKAAATTT {
    public static void main(String[] args) {
        //verilen inputa gore asgidaki sekli olusturun
        //*
        //* *
        //* * *
        //* * * *
        //* * *
        //* *
        //+
        //artan kismi nestedforloop la yapalim
        int input=4;                    //bu loopla 4 e kadar yapariz sonra 3 den devam ederiz
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
                
            }
            System.out.println(" ");
        }
    }
}
