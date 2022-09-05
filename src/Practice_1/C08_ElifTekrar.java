package Practice_1;

import java.util.Scanner;

public class C08_ElifTekrar {
    public static void main(String[] args) {
        //kullanicidan Y/N ikilisinden birini  girdiginde girdigi degeri ekrana yazdiran java kodun yazdirin
        //INPUT: y / N
        //OUTPUT:YES / NO
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Y veya  N hrflerinden birini giriniz");
        char karakter=scan.next().charAt(0);

        if(karakter=='Y'||karakter=='y'){
            System.out.println("yes");
        }else if(karakter=='N'||karakter=='n')
        {
            System.out.println("no");
        } else{
            System.out.println("lutfen sadece istenen karakter giriniz");}



    }
}
