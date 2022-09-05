package day03_scanner;

public class C01_Ascitable {
    public static void main(String[] args) {

        int sayi   =10;
        char harf  ='a';
        String str ="banan";
        System.out.println(sayi+harf);
        System.out.println(harf+str);
        System.out.println(str+sayi);
        System.out.println(harf+2);
        System.out.println(str+sayi+harf);   //banan10a
        System.out.println(""+sayi+harf);

        char deger = '1';
        System.out.println(deger+harf); // 1 in degeri ve harfin degeri toplanir
                                       //   49+97
    }
}
