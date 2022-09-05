package day10_stringManipilation;

public class C05_length {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length());//str in karakter sayisini dondurur 19
        System.out.println(str.charAt(str.length()-1));//son karakteri yazdiralim p
        System.out.println(str.charAt(str.length()-3));//sondan 3. karakter k

        /*javada null pointer(isaretleyici) bir deger degil,
        karsisina yazildigi variable in hicbir deger almadiginin isaretcisidir*/

        String str2="";                      //str 2 ye bir deger atanmismidir evet
        System.out.println(str2.length());      //bu deger nedir :hiclik//0
        String str3=null;
        System.out.println(str3.length());
        //str 3 edeger atanmismidir hayir
        // null bir deger atanmamayi isaret eder
        // degeri yok expection

    }
}
