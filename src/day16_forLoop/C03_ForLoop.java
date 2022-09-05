package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        //10 dan 30 a kadr olan sayilari aralarinda virgul olacak skilde yazdirin
         int bas=10;
         int son=30;
         //dinamik yapmak icin sayilarin yerine bas ve son diyelim
        for (int i = bas; i <=son ; i++) {
           if(i<son){
               System.out.print(i+",");  //"DIKKATT"yanyana yazmak icin ln leri sildik soutta
           }else if (i==son){
               System.out.print(i);
           }

        }
    }
}
