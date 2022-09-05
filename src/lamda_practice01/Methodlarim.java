package lamda_practice01;

public class Methodlarim {
    public static boolean ciftleriBul(int x){
        return x%2==0;

    }
    public static boolean teksayilarBul(int x){
        return x%2!=0;
    }
    public static void yazdir(Object obj){
        System.out.print(obj+ " ");
    }
    public static char sonHarfiBul(String str){
      return   str.charAt(str.length()-1);
    }
    public static void altAltayazdir(Object obj){
        System.out.println(obj+ " ");

}}
