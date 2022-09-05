package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20 den 50 ye kadar cift sayilari yazdiralim
        int bas=20;
        int bitis=50;
        for (int i = 20; i <=50 ; i++) {
            if(i%52==0) {
                System.out.print(i + " ");

            }}

        int temp=bas;
        while (temp <= bitis) {
            if(temp%2==0){
                System.out.print(temp+" ");
        }
            temp++;
    }}}

