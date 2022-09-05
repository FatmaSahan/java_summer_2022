package day10_stringManipilation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Beni piskopata baglamayin";
        System.out.println(str.toUpperCase());//BENI PISKOPATA BAGLAMAYIN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

    }
}
