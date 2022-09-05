public class Practise_4 {  /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {
       String  str="baba araba";

        tekrarsizYazdir(str);


        }

    private static void tekrarsizYazdir(String str) {
        String output="";
        str=str.replaceAll("\\s","");


        for (int i = 0; i <str.length() ; i++) {
            if(!output.contains(str.substring(i,i+1))){
                output+=str.substring(i,i+1);

            }



        }
        System.out.println(output);
    }


}
