package day17_nestedForLoop;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        //verilen Stringdeki kullanilan harfleri
        //// tekrarsiz olarak yazdirip
        ////kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        //"taka tuka.....taku yazmasi gibi

        String input="hava civa yapma";
        int harfSayi=1;

        String yeniInput=input.replaceAll("\\W","");//bosliklar gider "fatmasahan" olur
        String tekrarsizHarfler="";
        tekrarsizHarfler+=yeniInput.substring(0,1);//j
        System.out.print(yeniInput.substring(0,1));//j harfini digerleriyleyanyana yazdirmak icin ln i sildim


        for (int i = 1; i <yeniInput.length(); i++) {
            if(!tekrarsizHarfler.contains(yeniInput.substring(i,i+1))) {


                System.out.print(","+yeniInput.substring(i,i+1));

                tekrarsizHarfler += yeniInput.substring(i, i + 1);
                harfSayi++;
            }
        }
        System.out.println("");
        System.out.println("input:"+input);
        System.out.print("tekrarsiz harfler:"+tekrarsizHarfler);
        System.out.println(" ");
        System.out.println("tekrarsiz harf sayisi="+harfSayi);




    }
}
