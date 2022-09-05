package day37_overridding;

public class FSupra extends EToyota{
    void yakit(){

        System.out.println("supra sadece benzin kullanir");
    }//private metodlar ovrride edilemezler
    //eger child classda parent clasdaki private metod ile ayni signutureda bir metod
    // olusturursaniz bu overridding metod olmaz

    @Override//notasyon
    void motor() {
        super.motor();

        //override notasyonu javaya bir gorev verir.java bu notasyonla birbirine bagli olan iki metodu surekli kontrol eder
        //eger parent clasdaki overridden metodu silerseniz cte verrir
        //override notasyonu kullanmak zorunlu degildir.fakat eger overriding silinirsekodun cte vermesini istemezsek kullnmak zorundayiz
    }
}
