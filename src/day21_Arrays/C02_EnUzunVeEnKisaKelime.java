package day21_Arrays;

public class C02_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {
        //VERILEN BIR STRING ARRATDE EN UZUN VE EN KISA KELIMEYIYAZDIRAN METODU YAZIn

        String [] kelimeler={"mehmet","ali","nurullah","hayriye"};
        enUzunVeKisaKelime(kelimeler);
    }
    public static void enUzunVeKisaKelime(String[] kelimeler) {
        String enUzunKelime=kelimeler[0];
        String enKisaKelime=kelimeler[0];
        for (int i = 0; i < kelimeler.length-1 ; i++) {
            if(kelimeler[i].length()>enUzunKelime.length()){
                enUzunKelime=kelimeler[i];

            }

        }
        for (int i = 0; i < kelimeler.length-1 ; i++) {
            if(enKisaKelime.length()>kelimeler[i].length()){
                enKisaKelime=kelimeler[i];
            }

        }
        System.out.println("en uzun kelime:"+enUzunKelime);
        System.out.println("en kisa kelime:"+enKisaKelime);


    }

    }






