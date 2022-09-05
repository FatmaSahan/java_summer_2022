package day11_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        //scanner sacn yani kullanicidan lmak yerine bu formatida kullanabiliriz)
        String kelime="kader"; //degistirebilirsin
        /*
        verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
            -verilen kelime cumlede kullanilmamis
            -verilen kelime cumlede sadece 1 kere kullanilmis
            -verilen kelime cumlede 1'den fazla kullanilmis
         */
        int kelimeIlkindex=cumle.indexOf(kelime);//neden int kullandik cunku islem bize sayi donduruuyor//yazi dondurdurduyse strng olurdu
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkindex==-1) {
            System.out.println("bu kelime cumlede hic kullanilmamistir");
        } else if (kelimeIlkindex==kelimeSonIndex) {
            System.out.println("bu kelime cumlede sadec 1 kez ullanilmistir");
        }else{
            System.out.println("bu kelime birden fazla kullanilmistir");

        }



    }
}
