package proje1_calisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adim2 {

   static List<String> urunismilist = new ArrayList<>();
   static List<Integer> fiyatlist = new ArrayList<>();
   static List<Integer> urunnuolist = new ArrayList<>();
   static Scanner scan=new Scanner(System.in);



    public static void main(String[] args) {
        listeC();

    }
    public static void listeC() {
        String [] urnisim={"kek","kola","cekirdek","dondurma"};
        int[] fiyat={2,3,5,4};
        int[] urunNosu={1,2,3,4};

        for (int i = 0; i <urnisim.length ; i++) {
              urunismilist.add(urnisim[i]);
        }
        for (int i = 0; i <urnisim.length ; i++) {
            fiyatlist.add(fiyat[i]);

        }
        for (int i = 0; i <urnisim.length ; i++) {
            urunnuolist.add(urunNosu[i]);
        }

        System.out.println("NO    URUN   \t \t  FIYAT");

        for (int i = 0; i <urnisim.length ; i++) {


            System.out.printf("%2d    %-8s       %2d £\n",urunNosu[i],urnisim[i],fiyat[i]);

        }
        sec();

    }

    public static void sec() {

        System.out.println("lutfen istediginiz urunun nosunu giriniz");
        int urungiris= scan.nextInt();






    }
}













