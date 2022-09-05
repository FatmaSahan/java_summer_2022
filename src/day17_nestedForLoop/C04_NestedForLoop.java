package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        //verilen inputa gore yildizlardan olusan bir ucgen olusturun
        //input=4 ise
        //*        1. satira 1
        //* *      2. satira 2 tane
        //* * *    3. satira 3 tane *
        //* * * *
       int input=4;
        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
    }
}
