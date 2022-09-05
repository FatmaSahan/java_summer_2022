package Replit_Sorulari;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        /*Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname s
        hould be uppercase)
        (Check credit card number, if there aren't 16 digit print "Invalid credit card number"
        Input :
        John White 1234234534561478
        Output :
        Name : J*#* W*#*#
        CCN : *### #*## #*## 1478

    */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi soyisminizi ve kart numaranizi giriniz");

        String isim=scan.nextLine();
        String soyIsim=scan.nextLine();
        String kartNo=scan.nextLine();
        if(kartNo.length()!=16) {
            System.out.println("lutfen numaranizi  16 haneli giriniz");
        }else {

        isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.toUpperCase().charAt(0)+soyIsim.substring(1).replaceAll("\\w","*");
        String yeniKartNo;
        yeniKartNo=kartNo.substring(0,4).replaceAll("\\w","*")+
                " "+kartNo.substring(4,8).replaceAll("\\w","*")+
                " "+kartNo.substring(8,12).replaceAll("\\w","*")+
                " "+ kartNo.substring(kartNo.length()-4);

        System.out.println(isim+"\n"+soyIsim+"\n"+yeniKartNo);
        }





    }}




