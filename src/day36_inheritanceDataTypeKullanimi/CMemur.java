package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {
    int saatUcreti = 12;
    int gunlukMesai = 9;

    protected void maas() {//memeurlar :3240 maas alir
        System.out.println("Memurlar:" + (30 * saatUcreti * gunlukMesai) + "maas alir");


    }

    protected void ozelSigorta() {
        System.out.println("memurlar %60 indirimli ozel sigorta yaptirabilirler");
    }

    public static void main(String[] args) {
        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();
        mmr1.ozelSigorta();//memurlar %60 indirimli ozel sigorta yaptirabilirler
        mmr1.sigorta();//personel
        System.out.println(mmr1.isim);//personel clasindan alir
        System.out.println(mmr1.soyisim);//personel
        System.out.println(mmr1.departmant);//personel


        BMuhasebe mhsb1 = new BMuhasebe();
    }        /*her ne kadar memeur clasinin icinde olsamad olusturdugumUZ obje muhasebe clasindan
        cunku data turu ve consruktur BMuhasebe
         *//*
        String str="fatma";//her bir clas ayni zamanda bi data turudur
        ArrayList<Integer> List=new ArrayList<>();
        Integer sayi=20;//reperclaslarda bir data turudur

        DOLAYISIYLA BMuhasebe classi obje olusturulabilen bir classdir yani data turudur

        */
}


