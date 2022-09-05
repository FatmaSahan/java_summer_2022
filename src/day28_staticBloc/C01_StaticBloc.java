package day28_staticBloc;

public class C01_StaticBloc {
    static int sayi;
    static {
        System.out.println("static blok calisti");

        /*static bloc clas uyelrinin hepsinden onece calisir.
        main methoddan da once calisir
        clas olusturuldugunda calisir genellikle clasla ilgili on ayarlamalar yada
         static variablara deger atamak icin kulllnilir
         static bloklarin clas icerisinde nerde oldugu onemli degildir
         once static boklar calisir
         birden fazla static blok varsa yukardan asagi calisir

         */
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);

        }static{
        System.out.println("main method altindaki static bloc calisti");


    }}

