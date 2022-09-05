package day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {
        String str="Ah be java";
        System.out.println(str.endsWith("java")); //true
        System.out.println(str.endsWith("Ah be java")); //tre
        System.out.println(str.endsWith("ah be java"));//false

        //soru1-kullanicidan email adresini girmesini isteyiniz
        //mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz"
        //@gmail.comile bitiyorsa "email adresiniz kaydedildi"
        // @gmail.com ile bitmiyorasa "lutfen yazimi kontrol edin "yazdirin

        String email="fatma@gmail.com"; //email yerine input ta yazabiliriz "bilgi girisi demek

        if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi giriniz");
        }else if(email.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol ediniz");
        }
    }}
