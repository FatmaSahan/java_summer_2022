package day24_arrayList_ForEachLoop;

public class C07_ArraydekiSayilarinKareToplami {
    public static void main(String[] args) {
        //bir integer loop olusturup bu sayilarin kareleri toplaminiekrana yazdirin
        int[] sayilar={2,3,4};
        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each*each;
        }
        System.out.println("kareler toplami:"+toplam);
    }
}
