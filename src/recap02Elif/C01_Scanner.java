package recap02Elif;

public class C01_Scanner {
    public static void main(String[] args) {
        //kullanicidan a ,b ve c sayilarini okuyarak asagidaki islemi yapan kodu yaziniz
        //a nin karesinden b nin karesini cikarip c nin 3 katina bolunuz
        //ornegin
        //a sayisini giriniz=5
        //b sayisini giriniz=3
        //c sayisini giriniz=1
        //sonuc=5.333333
        double a=5;
        double b=3;
        double c=1;//(a*a-b*b)/3*c
        double sonuc=(a*a-b*b)/3*c;
        System.out.println(sonuc);//bu soruyu scanner alarak yani kullanicidan alarakda yapabilirdik
    }
}
