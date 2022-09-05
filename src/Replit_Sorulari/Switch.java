package Replit_Sorulari;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       /* Example:
        Display prompt: "Enter command:"
        input: a -Display prompt: "Your request is being processed"

        Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
        yanıt a ise, talebiniz işleniyor mesajı yazdırılır
        yanıt b ise, yine de ilgilendiğiniz için teşekkür ederiz mesajı yazdırılır

        yanıt c ise, Üzgünüz, şu anda herhangi bir yardım yok mesajı, yanıtın başka herhangi bir değeri için yazdırılır,
        "Geçersiz giriş, lütfen tekrar deneyin!" mesajı yazdırılır
        Tarayıcı nesnesi oluşturun.
                Belirtilen dizindeki char değerini almak için charAt0 yöntemini kullanın.

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen a b yada c giriniz");
        char harf=scan.next().charAt(0);
        switch (harf){
            case 'a':
                System.out.println("talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yinede ilgilendiginiz icin tesekkurler");
                break;
            case 'c':
                System.out.println("uzgunuz su anda herhangi bir yardim mesaji yok");
                break;
            default:
                System.out.println("gecersiz giris lutfen tekrara deneyin");
        }
    }}







