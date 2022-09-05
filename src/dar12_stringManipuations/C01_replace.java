package dar12_stringManipuations;

public class C01_replace {
    public static void main(String[] args) {
String str=" Bu gun ha va cok gu zel ";

        System.out.println(str.replace(" ",""));

        //hava kelimesini java yapalim
        System.out.println(str.replace("h","j"));


        //gu zel yerine harika yapalim
        System.out.println(str.replace("gu zel","harika"));


        //replace kullanarak Bugun Java cok guzel yapalim

        str=str.replace("Bu gun","Bugun")     //atama yaptigimizda kalici olur
                .replace("ha va","java")
                .replace("gu zel","guzel");

        System.out.println(str);





    }
}
