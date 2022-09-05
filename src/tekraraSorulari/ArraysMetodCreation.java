package tekraraSorulari;

public class ArraysMetodCreation {
    /*34-----
    String array dizisindeli 5 harfli kelimeleri return eden methodu yazınız.

    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     */
    public static void main(String[] args) {
        String[] array={"domates","patates","cilek","karpuz","kelek"};

        besHarflileriGetir(array);
    }

    public static String besHarflileriGetir(String[] array) {

        String kelimeler="";
        for (int i = 0; i < array.length ; i++) {

                if (array[i].length()==5)
                {
                kelimeler.concat(array[i]+",");///???????????
                }

            }
            System.out.println(kelimeler);

        return kelimeler;
    }
}

