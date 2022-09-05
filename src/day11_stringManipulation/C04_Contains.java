package day11_stringManipulation;

public class C04_Contains {
    public static void main(String[] args) {
        //KULLANICIDAN BIR CUMLE ISTEYIN
        //CUMLEDE 'BUYUK' KELIMESI GECIYORSA TUM CUMLEYI BUYUK
        //CUMLEDE'KUCUK' KELIMESI GECIYORSAA TUM CUMLEYI KUCUK OLARAK YAZDIRIN
        String cumle="Java buyuk , dunya kucuk ";
        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk")&&cumle.contains("kucuk"))  //en sinirlayici olani ilk yazmaliyiz cunku
                                                                       //java bastan sona dogru ve yukardan asagiya dogru calisir
        { System.out.println("buyukmu yazdirayim kucukmu karar ver");
        }else if(cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else {
            System.out.println("buyk yada kucuk kelimesi icermiyor");
        }

}}
