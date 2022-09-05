package recap02Elif;

public class C05_NestedTernary {
    public static void main(String[] args) {
        //final notu tanimlayan nested ternary ile cozunuz
        //'A'  gayet basarili
        //'B '   BASARILI
        //'C'     HA GAYRET
        // ''BU NOTLAR DISINDAKILERE DE DIGERLERI YAZDIRINIZ
        char finalNotu='D';
        String finalnotu =finalNotu=='A'?"GAYET BASARILI":finalNotu=='B'?"BASARILI":finalNotu=='C'?"HA GAYRET":"DIGERLERI";
        System.out.println("SONUC:"+finalnotu);
        // ? ISE OKUNUR
        // : DEGILSE OKUNUR

    }
}
