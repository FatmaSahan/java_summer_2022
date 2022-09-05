import java.util.Scanner;

public class TEKRARASORULARI_40 {
    public static void main(String[] args) {
        //1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.*/
        int sayi = 23456;
        int topla = 0;
        while (sayi > 0) {

            topla += sayi % 10;
            sayi /= 10;


        }
        System.out.println("sayi degrler toplami=" + topla);

 /* 2---1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
          Hint: For döngüsü kullanınız.
          Beklenen Çıktı:
          1
          2
          3
          4
          .
          .
          .
          19
          20*/
        {
            int bitis = 20;
            for (int i = 1; i <= bitis; i++) {
                System.out.println(i);
            }
        }



/*  3----belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50*/


        int input = 10;
        int a = 5;

        for (int i = 1; i <= input; i++) {

            {
                System.out.println(a + " * " + i + " = " + a * i);
            }

        }






  /*  4----1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
     Beklenen çıltı:

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910

*/

        int temp = 10;

        for (int i = 1; i <= temp; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println(" ");

        }




   /* 5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *      */


   /*  6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
​
    Sesli harfler: a,e,i,o,u
​
    Test Data:
    a
​
    Beklenen Çıktı:
    a harfi sesli harfdir.
​
    Test Data:
    d
​
    Beklenen Çıktı:
    d harfi sesiz harftir.
​
    Test Data:
    we  yada %
​
    Beklenen Çıktı:
    Yanlis karakter girdiniz!*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harfgiriniz");
        char harf = scan.next().charAt(0);

        if (!((harf >= 'A' && harf <= 'Z') || (harf >= 'a' && harf <= 'z'))) {
            System.out.println("yanlis karakter girdiniz.lutfen tekrar deneyiniz");
        } else if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u'
                || harf == 'A' || harf == 'E' || harf == 'I' || harf == 'O' || harf == 'U') {
            System.out.println("Girilen harf sesli harftir");
        } else {
            System.out.println("Girilen harf sesiz harftir");

        }

   /* 7-----
       Ugly Number:
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.

    Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    Test Data:
    13
    Beklenen çıktı:
    ugly number  degildir
    Test Data:
    25
    Beklenen Çıktı:*/
        //while ile

        int sayi2=21;
        while (sayi2>1) {
            if (sayi2%2==0) {
                sayi2/=2;
            } else if (sayi2%3==0) {
                sayi2/=3;
            } else if (sayi2%5==0) {
                sayi2/=5;
            } else {
                System.out.println("Ugly number degildir");
                break;
            }
        }
        if (sayi2==1){
            System.out.println("Ugly number");}




        //yukardaki sorudan bagimsiz asal sayilari bulalim
        int imput = 19;
        int kontrol = 1;
        for (int i = 2; i < imput; i++) {
            if (imput % i == 0) {
                kontrol = 0;
                break;
            }
        }
        if (kontrol == 0) {
            System.out.println("asal sayi degildir");
        } else {
            System.out.println("asal sayidir");

        }




    /*
    8----
     Girilen String değerdecccccccccccc
      tersten yazan Java kodunu yazınız.
    Test Data:
    java
    avaj
    */
        String kelime = "ZAMAN";
        for (int i = 1; i <= kelime.length(); i++) {
            System.out.println(kelime.charAt(kelime.length() - i));

        }

/*
    9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.
      Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun*/
        String str1="fatma";
        String str2="sahan";

        System.out.println(str1.concat(" "+str2));



   /* 10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
    Test Data:
    Java is easy
    Aranan String: is
    Bektenen Çıktı:
    True
    Aranan String: and
    Beklenen Çıktı:False*/
        String cumle="Hayat herseye ragmen guzeldir";
        String arananStr="kel";

        if(cumle.contains(arananStr)){
            System.out.println(arananStr+" stringi cumlede vardir");

        }else if (!cumle.contains(arananStr)){
            System.out.println(arananStr+" cumlede yoktur");



   }}}
/*
​
​
    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]
​
    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    ************************************************************************
    21----
    Array deki sayıları tolpayan Java kodunu yazınız.
​
    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
​
    Beklenen Çıktı:
    Array toplamı: 55
    ************************************************************************
    22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
​
    Array =  [20, 30, 25, 35, -16, 60, -100 ]
​
    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
    ************************************************************************
    23----
    Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
​
    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
    ************************************************************************
    24----
    yazılan değerin array içerisinde arayan Java Kodu yazınız.
​
    Array: [1551,1223,1443,1267,1789,1023,2020]
​
​
    Aranan Değer:2020
    Beklenen Çıktı:True
​
    Aranan Değer:2010
    Beklenen Çıktı :False
    ************************************************************************
    25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
​
    Array: [12,15,43,23,56,76,78,90,77,43]
​
    Aranan değer:56
​
    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
​
    ************************************************************************
    26-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
​
    Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
​
    ************************************************************************
    27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
​
    Array: [1232,2345,5467,678,3454,2312,3451]
​
    ************************************************************************
    28----
    Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
​
    Array: [1,2,3,4,5,6,7,8,9]
​
    Beklenen Çıktı:
​
    Tek Sayilar: 5
    Cift Sayilar: 4
    ************************************************************************
    29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
​
    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
​
    ************************************************************************
    30---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
​
    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010
​
    Beklenen Çıktı:
    1010100
    ************************************************************************
    31----
    Saati saniyeye çeviren java methodunu yazınız.
​
    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    ************************************************************************
    32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
​
    num1 = num2 => true
    ************************************************************************
    33-----
    Bir arrayi tersine çeviren  method yazınız.
​
    Test Data:
​
    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    ************************************************************************
    34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.
​
​
    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])
​
     ["Pair"]
    ************************************************************************
    35----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.
​
    Test Data:
    arrayOfMultiples(7, 5)
​
    sonuç: [7,14,21,28,35]
​
    ************************************************************************
    36-----
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
​
    Test Data:
​
    isPrime(31)
    true
​
    isPrime(18)
    false
    ************************************************************************
    37-----
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
​
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
​
    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m
​
    İpucu harfleri değiştirin ve ekrana yazdırın.
    ************************************************************************
    38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
​
    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
​
    ************************************************************************
    39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
​
    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.
​
    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
​
    ************************************************************************
   */


