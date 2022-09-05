package day18_doWhileLoop;

public class C05_doWhileLoop {
    public static void main(String[] args) {
        //9 dan 190 a kadar olan 7 e bolunebilen tum tamsayilari yazdirin

       int sayiBas=9;
       int sayiBitis=49;
       int temp=sayiBas;

       do {
           if ((temp%7==0))
           System.out.print(temp+" ");
            temp++;
       }
       while (temp<=sayiBitis);

    }
}
