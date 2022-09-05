package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

                char harf='a';
               // char yeniharf=harf+1;
                                    // busekilde yazdigimizda sagtaraf 98olur.
                                    // fakat char karakter olmali oyuzden sinyal verir
                char yeniharf=(char)(harf+1);  // 98 edenkgelen harf olur yani b

                System.out.println("yeniharf:" + yeniharf);


                double sayi2=10;
        System.out.println("sayi2:"+sayi2);
                int sayi3='c';
        System.out.println("sayi3:"+sayi3);
                char harf2=98;
        System.out.println("harf2:"+ harf2);
    }
}
