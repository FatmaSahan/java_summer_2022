package lamda_practice01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Lamda02_DosyaOkuma {

    public static void main(String[] args) throws IOException {

        //src/lamda_practice01/siiirler.txt//siir dosyasinin yolu
            System.out.println("\nTASK 01 --> siirler.txt dosyasini konsolda yazdiriniz -->  ");
            //1. yol
            Path muti=Path.of("src/lambda_practice/siirler.txt");//siirler dosyasi muti obj sine atandi
            Stream <String> akis=Files.lines(muti);//muti obj si akis obj sine atanarak Stream classsinda akisa alindi
            // akis.forEach(System.out::println);
            //buyuk harfe cevirdil
            akis.map(String::toUpperCase).forEach(Methodlarim::yazdir);

            //2.yol
           Files.lines(Path.of("src/lamda_practice01/siiirler.txt")).forEach(Methodlarim::altAltayazdir);

            System.out.println("\nTASK 1  --> siirler.txt dosyasindaki ilk satiri kucuk harflerle yazdirin  -->  ");



            System.out.println("\nTASK 2 --> siirler.txt dosyasinda basari kelimesinin kac satirda gectiginiz yazdiriniz -->  ");


            System.out.println("\nTASK 3  --> siirler.txt dosyasindaki ayni kelimeleri cikartarak y yazdiriniz. -->  ");



            System.out.println("\nTASK 4 --> siirler.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");



            System.out.println("\nTASK 5 --> siirler.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");


            System.out.println("\nTASK 6 --> siirler.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");



            System.out.println("\nTASK 7 --> siirler.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");



            System.out.println("\nTASK 8 --> siirler.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");



            System.out.println("\nTASK 9 --> siirler.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");



            System.out.println("\nTASK 10 --> siirler.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

        }}