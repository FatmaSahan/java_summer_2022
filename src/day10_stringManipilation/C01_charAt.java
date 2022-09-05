package day10_stringManipilation;

public class C01_charAt {
    public static void main(String[] args) {
       String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0));//ilk harfi yazdirir yani j
        System.out.println(str.toUpperCase().charAt(7));// R
        System.out.println(str.charAt(21));//l
         System.out.println(str.charAt(8));
        System.out.println(str.toUpperCase().charAt(8));
        System.out.println(str.charAt(5));

        System.out.println(str.charAt(22));// exception verir

        //son harfi bulmakicin str in uzunlugunun 1 eksigini index olarak gireriz
        //charAt() metodu kullandigimizda sonuc charAt olacagi icin artik manipulation yapamayiz
        //String metodlarinadan kulllanmamiz gereken metod varsa charAt ten once kullanmaliyiz


    }
}
