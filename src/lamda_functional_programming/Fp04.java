package lamda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        //1:
        //7 den 100 e kadar integerlarin toplamini bulan metod olusturunuz
        //BURDA BIZE VERILMIS LISTE YOK ARTIK
        System.out.println(yedidenYuzeKadarIntTopla());
        System.out.println(yedidenYuzeKadarIntTopla2());
        System.out.println(get2den12yeCarp());
        System.out.println(faktoriyelHesapla(4));
        System.out.println(ikiSayiArasindakiTopla(5, 12));
        System.out.println(ikiSayiArasindaSayilarRakamlarToplami(23,32));
    }

    //1.yol
    public static int yedidenYuzeKadarIntTopla() {
        return IntStream.range(7, 101).reduce(Math::addExact).getAsInt();
    }

    //2.yol
    public static int yedidenYuzeKadarIntTopla2() {
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
    }

    //2 den 11 e kadatr int degerlerin carpimini veren metodu olusturunuz
    public static int get2den12yeCarp() {
        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyelHesapla(int x) {

        if (x >= 0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan büyük değer giriniz");

        return 0;

    }

    //4) VERILEN IKI SAYI ARSINDA CIFT SAYILARIN TOPLAMINI BULAN METOD OLUSTURUNUZ
    public static int ikiSayiArasindakiTopla(int x, int y) {
        int z = 0;
        if(x>y){
            z = x;
            x = y;
            y = z;
        }
        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemaniSec).sum();
    }
    //verilen iki sayi arasindaki tum sayilarin rakamlar toplamini hesaplayan metod olusturunuz
    public static int ikiSayiArasindaSayilarRakamlarToplami(int x,int y){
        int z = 0;
        if(x>y){
            z = x;
            x = y;
            y = z;
        }
     return    IntStream.rangeClosed(x,y).map(Utils::rakamkarToplaminiAl).sum();
    }

}



