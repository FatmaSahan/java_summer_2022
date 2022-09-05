package day10_stringManipilation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";//indexof gordugu ilk karakterin indexini alir.index sayarken 0 dan baslariz

        System.out.println(str.indexOf('o'));// 5
        System.out.println(str.indexOf("g")); // 6" " strinkolark da yazabiliriz
        System.out.println(str.indexOf("t"));// t olmadigi icin -1 yazdirir

        String str5="fbchdjrurovmbnjpwwlm";// str5 de p harfi varmidir
        if(str5.indexOf("p")==-1) {
            System.out.println("str da istenen karakter kullanilmamistir");
        }else{
            System.out.println("str da istenen karakter kullanil]mistir");

        }

    }
}
