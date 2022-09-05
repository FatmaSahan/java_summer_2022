package proje2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step_1 {
    static List<String> urunIismleriListesi=new ArrayList<>();
    static List<Integer> urunFiyatListesi=new ArrayList<>();
    static List<Integer>urunNoListesi  =new ArrayList<>();
    static List<Integer>sepetListesi  =new ArrayList<>();
    static int genelToplam=0;
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        listeOlustur();
    }
    public static void listeOlustur() {
        String[] urunIismleri = { "Cekirdek", "Cikolata",
                "Pizza", "Kahve", "Cay ", "Ceheeskek", "Kola", "Su", "Kek","Doner"};
        int[] urunFiyatlar = {3,2,6,4,2,8,3,1,5,12};
        int[] urunNo = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};



            //listelere elman ekeldim
            for (int j = 0; j <urunIismleri.length ; j++) {
                urunIismleriListesi.add(urunIismleri[j]);
            }
            for (int j = 0; j <urunFiyatlar.length ; j++) {
                urunFiyatListesi.add(urunFiyatlar[j]);
            }
            for (int j = 0; j <urunFiyatlar.length ; j++) {
                urunNoListesi.add(urunNo[j]);
            }
     System.out.println("No\tUrun\t\tFiyat");
        for (int i = 0; i <urunIismleri.length ; i++) {
            System.out.printf( "%2d  %-9s  %2d £\n",urunNo[i],urunIismleri[i],urunFiyatlar[i]);}}}



