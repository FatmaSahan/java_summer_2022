package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        //bazen dek degisken soruyu cozmeye yetmez
        // *
        //  * *
        //  * * *
        //  * * * *
        //yan yana uc tane yildizyazdirlim
        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");} //yanyana oldugu icin ln sildik
            //yanyana 4 yildiz yapalim alta

        {System.out.println(" ");}//DIKKAAT: 3 yildiz ve 4 yildiz altta  print ln(" ") yazdirdik

            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");}
            //1.satirda 1 yidiz
            //2. satirda 2 yidiz
           //3. satirda 3 yildiz...oruntulu
            //bu sekilde altta yildizleriolusturmak icin
            //bu tur durumlarda icice(nested)loop kullanmakgerekir
        System.out.println(" ");//satir atlayalim
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* "); //ln sildik * yildizlari yanyana yazmak icin

            }
            System.out.println(" ");//satir atlamak icin
        }


            }

        }


