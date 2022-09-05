package day15_overloading_Forlop;

public class C05_Forloop {
    public static void main(String[] args) {
        //soru1)
        // 1 den 5 e kadar olan tamsayilari toplayalim(5 dahil)
        //loop dongudur kendi icinde tekrar tekrar calisir

        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            toplam += i;            //"DIKKAT" toplami loopin icine yazdigimiza dikkat et
        }
        System.out.println("1 den 5'e kadar olan sayilarin toplami=" + toplam);//"DIKKAT" soutu loopun disina yaziyoruz

        //soru2)
        // 10 dan 20 ye kadar olan sayilari toplayin
        int toplam1 = 0;  //yukardaki toplam javanin aklinda kaldigi icin toplami tekrar 0 ladik
        for (int i = 10; i <= 20; i++) {
            toplam1 += i;

        }
        System.out.println("10 dan 20 ye kadar olan sayilrin toplami=" + toplam1);

        //soru3)
        //soru3)
        //30 dan 50 ye kadar olan cift sayilarin toplami // baslangic noktasinin cift oldugunu bildigimizde bu sekil olabilir
         toplam = 0;
        for (int i = 30; i <=50; i += 2) {
            toplam += i;
        }
        System.out.println("30 dan 50ye kadar olan saylarin toplami=" + toplam);

        // baslngc noktsn cift olup olmadigini bilmiyorsak

        toplam = 0;
        for (int i = 30; i <=50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("30 dan 50 ye kadar olan cift sayilarin toplaami=" + toplam);

        //soru4)
        // 1500 ile 1600 arasinda 7 ile bolunebilen sayilarin toplami
        toplam = 0;
        for (int i =1500; i<=1600; i++) {
            if (i%7==0){
                toplam+=i;}
        }
        System.out.println("1500_1600 arasi 7 ye bolunen sylarin toplami=" + toplam);


    }

}








