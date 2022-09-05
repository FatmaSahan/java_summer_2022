package Replit_Sorulari;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
         /*
    Ask user to type a name,
    the length of name should be 3.
    Then check if the name has same characters.

    If the String has same characters
    Print "String has duplicate characters" Else
    Print "String has unique characters"

TR  Kullanıcıdan bir ad yazmasını isteyin,  1- String bir ifade istenecek
    adının uzunluğu 3 olmalıdır.            2- 3 veya daha uzun olacak
    Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

    Dize aynı karakterlere sahipse
    Yazdır "Dize çift karakterler içeriyor" Aksi takdirde
    Yazdır "Dizenin benzersiz karakterleri var"

    Lütfen üçlü kullanın.
    Giriş :

    ala
    Çıktı:
    Dize yinelenen karakterler içeriyor
     */
        Scanner scan=new Scanner(System.in);
        String input;
        do {
            System.out.println("String bir ifade giriniz");
            input=scan.nextLine();//abdhbcnsa

            for (int i = 0; i <input.length() ; i++) {
                for (int j = i+1; j <input.length() ; j++) {
                    if (input.substring(i,i+1).equals(input.substring(j,j+1))){

                    }

                }

            }


        }while (input.length()<3);
    }
}
