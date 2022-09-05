package Practise_3;

public class C07_StringManpulation {
    public static void main(String[] args) {
        //String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        String str1="$13.99";
        String str2="$10.99";
        //ipucu:Double parsedouble(string sayilari double cevirir)

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);
        Double Toplam=(sayi1+sayi2)/100;
        System.out.println("toplam="+"$"+Toplam);

    }
}
