package day22_multiDimensenalArrays;

public class C02_MdaTumElementleriniYazdirma {
    public static void main(String[] args) {
        //verilen bir multi dimensel arrayin tim elementlerini yazdiran method olusturalim
        int[][] sayilar={{2,3,4,1},{4,7},{8,9,5}};
        elementleriYazdir(sayilar);
    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {
            for (int s = 0; s < sayilar[i].length; s++) {
                System.out.print(sayilar[i][s]+" ");

            }

        }
    }
}
