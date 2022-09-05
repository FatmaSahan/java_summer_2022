package day10_stringManipilation;

public class C03_equalsMetodu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="ALI CAN";
        String str3="Ali Can"+ "";//"" hiclik
        String str4="Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str1==str2);// false == de birebir ayni olmadigi icin
        System.out.println(str1==str3);//false//==  da brebir ayni olasi gerektigi icin false
        System.out.println(str1.equals(str3));//true//equals larda ifadenin ayni olmasi yeterli oldugu icin
        System.out.println(str1==str5);//false
        System.out.println(str1.equals(str5));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str3.equals(str5));//true
        System.out.println(str3==str5);//false

//Stringlerde ayni String olsa bile == herzaman calismaz emin olmakisterseniz equals kullanmalisiniz
     //equals metodu kullandiginizda dikkat edeceginiz TEKSEY metinlerin bire bir ayni olmasidir
}}
