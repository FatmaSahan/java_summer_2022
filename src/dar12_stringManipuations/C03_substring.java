package dar12_stringManipuations;

public class C03_substring {
    public static void main(String[] args) {
        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 5678 9101 2345";

        System.out.println(isim.substring(3));//index 3 ve sonrasini al //eyman
        System.out.println(soyisim.substring(5));       // fil
        //soyismin son 4 harfini al
        System.out.println(soyisim.substring(soyisim.length()-4)); //nfil
        //ismin ilk son 3 harfini al
        System.out.println(isim.substring(isim.length()-3)); //man

        System.out.println(soyisim.substring(2,4));  //2. index ve 4 ekadar 4 dahil degil//ra

        //isim ve soyisim ilk harfi buyuk harf geriye kalan *
        //kart no sunun ilk 4 rakami gorunsun geriye kalan *

       String ilkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyekalan=isim.substring(1).replaceAll("\\w","*");

        String soysimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyekalan=soyisim.substring(1).replaceAll("\\w","*");

        String kartNoIlk4=kartNo.substring(0,4);
        String kartNoGeriyekalan="**** **** ****";
        System.out.println(ilkHarf+isimGeriyekalan+" "+soysimIlkHarf+soyisimGeriyekalan+" \n"+kartNoIlk4+" "+kartNoGeriyekalan); //\n le kart noyu alta yazdirdik






    }
}
