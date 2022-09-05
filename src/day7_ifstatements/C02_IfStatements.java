package day7_ifstatements;

public class C02_IfStatements {
    public static void main(String[] args) {
        int sayi=10;

        if(sayi>0) {
            System.out.println("sayi poziftir");
        }
        if (sayi%2==0) {
            System.out.println("sayi cifttir");
        }
        if (sayi%5==0){
            System.out.println("sayi 5'in tam katidir");
        }

         int sayi1=-24;
        if (sayi>0)
            System.out.println("sayi pozitiftir");   //suslu parantez kullanmadigimizda ilki sarta bagli calisir
                                                     // digreleri hre harikarda calisir
            System.out.println("pozitif kalacaktir");
            System.out.println("ucuncu satir");

    }
}
