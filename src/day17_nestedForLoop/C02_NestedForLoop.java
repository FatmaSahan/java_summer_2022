package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        //verilen sayiya gore carpim tablosu olusturun
        //input 3
        //1 2 3
        //2 4 6
        //3 6 9
        int input=3;
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.print(i*j+" ");  //ln i sildik sayilar 123 seklinde yanyana geldi


            }
            System.out.println(" "); //123 den sonra alt satir yapar

        }
    }
}
