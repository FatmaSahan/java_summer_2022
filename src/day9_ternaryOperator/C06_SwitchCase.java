package day9_ternaryOperator;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //kullanicidan gun ismi alin
        //hafta ici yada hafta sonu oldugunu yazdirin
        //ayni sonucu icerenleri tek sefer yazdirabiliriz

                                         String Imput="pazar";      //burdan gun ismini degistirip run yap


                                         switch(Imput){
                                         case("pazartesi"):
                                         case("sali"):
                                         case("carsamba"):
                                         case("persembe"):
                                         case("cuma"):
                                             System.out.println("hafta ici");
                                             break;
                                             case("cumartesi"):
                                         case("pazar"):
                                             System.out.println("hafta sonu");
                                             break;
                                         default:
                                             System.out.println("lutfen gecerli bir gun giriniz");
    }}
}
