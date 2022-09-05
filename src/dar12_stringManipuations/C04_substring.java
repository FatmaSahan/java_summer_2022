package dar12_stringManipuations;

public class C04_substring {
    public static void main(String[] args) {

        String str="java cok yasa";

        System.out.println(str.substring(3,4));//3 den basla// 4 ekadar 4 dahil degil//a
        System.out.println(str.substring(5,7));//co
        System.out.println(str.substring(6,6));//"" hiclik
        System.out.println("===");
        System.out.println(str.substring(6,2));//sintex hatasi vermez fakat calistirdigimizda exception verir

    }
}
