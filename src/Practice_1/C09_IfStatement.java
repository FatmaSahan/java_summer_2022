package Practice_1;

public class C09_IfStatement {
    public static void main(String[] args) {
        /* not hesaplayici

        0-59 ISE F
        60-69 ISE D
        70-79 ISE C
        80-89 ISE B
        90-100 ISE A YAZDIRIN

         */

       int not=-5;

        if (not >= 0 && not <= 59) {
            System.out.println("not=" + 'F');

        } else if (not >= 60 && not <= 69) {
            System.out.println("not=" + 'D');
        } else if (not >= 70 && not <= 79) {
            System.out.println("not=" + 'B');
        } else if (not >= 90 && not <= 100) {
            System.out.println("not=" + 'A');
        }else {
        System.out.println("lutfen gecerli bir not giriniz");}


    }

}



