package day13_creation;

public class C03_StringManipilations {
    public static void main(String[] args) {
        //String methodlarını kullanarak " Java ogrenmek123 Cok guzel@ "
        //Stringini " Java ogrenmek cok guzel." şekline getirin

        String str=" Java ogrenmek123 Cok guzel@ ";
        str=str.trim();
        str=str.replaceAll("\\d","");
        str=str.replaceAll("@",".");
        str=str.replaceAll("C","c");
        System.out.println("str:"+str);


    }
}
