public class C01_FoorLoop {
    public static void main(String[] args) {
      /*  //0-255 e kadar olan harf ve karakterlerin kendisini ve sayisal degerini yaziniz
        int karakter = 255;
        for (int i = 0; i <= karakter; i++) {
            System.out.print(((char) i) + " -> " + i);
        }*/
        System.out.println("while ile yapalim");
        int i=0;
        while (i<=255){
            System.out.println((char) i + " -> " + i);
            i++;
        }
        System.out.println("do while ile yapalim");
        int a=0;
        do {
            System.out.println((char) i + " -> " + i);

            a++;
        }while (a<=255);
    }}