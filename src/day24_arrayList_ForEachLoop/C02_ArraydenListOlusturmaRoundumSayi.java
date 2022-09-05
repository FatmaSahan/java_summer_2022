package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturmaRoundumSayi {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */

        Random rndSayilar=new Random();
        int sayi=0;
        List<Integer> sayiList=new ArrayList<>();

        while (sayiList.size()<=200){
            sayi=rndSayilar.nextInt(1000);
            if (!sayiList.contains(sayi)){
                sayiList.add(sayi);
            }

        }
        System.out.println(sayiList);

        //simdi kullanicidan sayi alalim ve tahminlerde bulunsun bildiginde oyun dursun
        Scanner scan=new Scanner(System.in);
        boolean bildiMi=false;
        int tahminSayisi=1;
        while (!bildiMi)//bildiMi==false oldugu surece calis bildiginde dur demketir burann anlami
        {
            System.out.println("1000 den kucuk bir pozitif sayi tahmin ediniz");
            int sayi1= scan.nextInt();
            if ( sayiList.contains(sayi1)){
                System.out.println("tebrikler "+tahminSayisi+ " adet tahminden listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi+" adet tahminde bulundunuz fakat hicbiri listede yok");
                tahminSayisi++;




        }}




    }}

