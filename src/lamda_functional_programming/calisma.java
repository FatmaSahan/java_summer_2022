package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class calisma {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        tekrarsizCiftElemanlarinKaresiniTopla(liste);
        System.out.println();
        tekrarszCiftKupunuCarpim(liste);
        System.out.println();
        enBuyukElemaniBul(liste);
        System.out.println();
        yedidenBuyukCiftEnBuyuk(liste);
        System.out.println();
        besdenBuyukElemanlarinYariDegeri(liste);

    }
    public static void tekrarsizCiftElemanlarinKaresiniTopla(List<Integer> list){
       Integer toplam= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
        System.out.println(toplam);
    }
    public static void tekrarszCiftKupunuCarpim(List<Integer> list){
        Integer carpim=list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }
    public static void enBuyukElemaniBul(List<Integer> list){
      Integer enBuyuk=  list.stream().reduce(Math::max).get();
        System.out.println(enBuyuk);
    }
    public static void yedidenBuyukCiftEnBuyuk(List<Integer> list){

    Integer enBuyuk=    list.stream().distinct().filter(Utils::ciftElemaniSec).filter(t-> t>7).reduce(Math::min).get();
            System.out.println(enBuyuk);
        }
        public static void besdenBuyukElemanlarinYariDegeri(List<Integer> list){
       List<Double> liste= list.stream().distinct().filter(t-> t>5).map(Utils::yarisiniAl).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(liste);
        }
    }

