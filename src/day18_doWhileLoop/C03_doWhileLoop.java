package day18_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {int sayi=7;
   // WHILE CONDITIONYANI SARTIMIZ:sayi 10 DAN KUCUKKEN calistir
        int sayi1=7;
        while(sayi<10){
            System.out.println(sayi); //7<10 ken 7  1 artar
                                      //8<10 ken 8  //9
                                      //9<10 ken 9 //10
            sayi++;                    //10<10 loopburda kirilir
            /* whileloopda once kontrol edip sonra islem yaptigimiz icin islem bittikten sonra
            loopun kirilmasi icin bir kez daha basa donmemeiz gerekir.yani cikti sayisindan 1 fazla calisir
             */
            // do while loop
            // do parantezinnin icine sout yapiyoruz
            // sonra artirma sonra while olduguna DIKKKAT et
            //7 her harikarda yazdirulir
            // cunku sarti gormeden yazdiriyoruz

        sayi=7;
        do {
            System.out.println(sayi);
            sayi++;}
        while (sayi<10); //7\8\9   3kere calisir

        }
    }

    }

