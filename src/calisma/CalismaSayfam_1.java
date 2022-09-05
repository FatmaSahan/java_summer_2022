package calisma;

import java.util.Scanner;

public class CalismaSayfam_1 {
    public static void main(String[] args) { /*

 \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
              \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
              \\: prints a back slash :\ (ters slash) yazdırır
              \': prints single quote :' tek tırnak yazdırır.
              \": prints double quote :"" Çift tırnak yazdırır.
                */
//  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız
        String kelime="\""+"Hello\t"+"\""+","+"\t"+"\""+"World"+"\t"+"\\"+" /"+"\"";
        System.out.println(kelime);

        //Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.
        //pazartesi
        System.out.println("P");
        System.out.println("A");
        System.out.println("Z");
        System.out.println("A");
        System.out.println("R");
        System.out.println("T");
        System.out.println("E");
        System.out.println("S");
        System.out.println("I");

      //  Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız
        String sentence="\""+"Java\""+" "+"ile hayat cok"+" "+"\'afilli\'";
        System.out.println(sentence); // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        /* soru4 ex: input:12345
         output: 1
                 2
                 3
                 4
                 5
                  consolda alt satira yazdırmak için "\n"  komutu kullanılır.
         */
        String sayi="5678";
        System.out.println("1\n2\n3\n4\n5");

        //soru5
        String b = "Java 1235 ?!@$_";  //ifadesinde çalışalım
        //b=b.replaceAll("\\d","");
        b=b.replace(b.substring(4),"");
        System.out.println(b);


        //soru6
                /* Kullanicidan uc basamakli bir sayi alin
                 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

                 * Ornek : Inputs : 853
                 * Output : Girdiginiz sayinin birler basamagi : 3
                 *          Girdiginiz sayinin onlar basamagi : 5
                 *          Girdiginiz sayinin yuzler basamagi : 8
                                 */
        int sayi1=980;
        int birlerBas=sayi1%10;
        sayi1/=10;//85
        int onlarBas=sayi1%10;
        int yuzlerBas= sayi1/=10;
        System.out.println("sayinin birler basmgi:"+birlerBas);
        System.out.println("sayinin  onlar basmgi:"+onlarBas);
        System.out.println("sayinin yuzler basmgi:"+yuzlerBas);

        /* soru7
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        int sayi2=56498;
        int rakamTop=0;

        int bB=sayi2%10;//5
        sayi2/=10;//1234
        int oB=sayi2%10;//4
        sayi2/=10;//123
        int yB=sayi2%10;//3
        sayi2/=10;//12
        int binB=sayi2%10;//2

        int onBB=sayi2/=10;
        rakamTop=bB+oB+binB+onBB;
        System.out.println("ilk ve son iki basamagin rakamlar Toplami:"+rakamTop);
        /* soru8
         Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan=new Scanner(System.in);
        System.out.println("UCGENIN DIK kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();

        double kenar2=scan.nextDouble();
        double x=kenar1;
        double y=kenar2;

        double hipotenus=Math.sqrt((x*x)+(y*y));

        System.out.println("hipotenus="+hipotenus);

        /* soru9
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        int mesafe=400;//km
        int hiz=100;//sa
        int sure=(mesafe/hiz) ;//km/sa
        System.out.println("sure "+sure);
        /*soru10
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        INPUT
        : Kilo: 72
        Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23*/
        double kilo=72;
        double boy=1.72;
        double vki=kilo/(boy*boy);
        System.out.println(vki);

/*  soru11
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        double a=5;
        double c=3;
        double d=1;
        double islem=((a*a)-(c*c))/3*d;




















        }























}
