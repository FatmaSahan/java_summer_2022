package dar12_stringManipuations;

public class C02_replaceAll {
    public static void main(String[] args) {
String str="1Bu2gu3n Ja9va- cok g3uz/el";
//all den kasit ayni ozellikteki tum karakterkeri kapsamsidir
        //  \\s bosluk(space)
        //  \\S  bosluk disindakiler
        //  \\w  harfler ve rakamlar
        //  \\W   harf ve rakamlarin disindakiler
        //  \\d   rakamlar
        //  \\d rakamlarin disindaki herseyi siler

        //str ="Bugun java cok guzel " haline getirelim
        str=str.replaceAll(" ","dasf");
        System.out.println(str);
        str= str.replaceAll("\\W","");
        System.out.println(str);
        str=str.replaceAll("\\d","");
        System.out.println(str);
        str=str.replaceAll("dasf"," ");
        System.out.println(str);






    }
}
