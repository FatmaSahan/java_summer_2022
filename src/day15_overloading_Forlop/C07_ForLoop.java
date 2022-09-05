package day15_overloading_Forlop;

public class C07_ForLoop {
    public static void main(String[] args) {
        //100 den 1 e kadar 8 ile bolinebilen sayilari yazdirin

        for (int i = 100; i >=1; i--) {
            if(i%8==0){
            System.out.print(i+" ");//yanyanayazmasi icin "ln" i silelim


        }
            //50 den 500 e kadar 15 ile bolunen cift sayilari yazdirin

            for (int j = 50; j <=300; j++) {
                if(j%15==0&&j%2==0){
                    System.out.print(j+" ");
                }

            }


        }}}



