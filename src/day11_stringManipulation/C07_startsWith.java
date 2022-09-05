package day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J")); //true
        System.out.println(input.startsWith("j"));  //false
        System.out.println(input.startsWith("gun",5));//true  //5. indexten sonra gunlemi baslar?//5 dahil
    }
}
