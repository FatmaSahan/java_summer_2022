package day30_immutuble_date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();//obje olusturduktan sonra onunismiyle yanitarihin yanina nokta koyarak metodlari cagirabiliriz
        System.out.println(tarih);//bugunun tarihi//2022_07_23
        System.out.println(tarih.getDayOfYear());//
        System.out.println(tarih.getYear());
        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.isLeapYear());//is le donenler true yada false doner artikyilolup olmadigini kontol eder

        LocalDate tarih2 = LocalDate.of(2001, 5, 15);
        System.out.println(tarih2);
        LocalDate tarih3 = LocalDate.of(1990, Month.JANUARY, 10);
        System.out.println(tarih3);//1990_01_10

        System.out.println(tarih.plusDays(100));//100 gun sonra hangi tarih
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//5 yil 3 ay 12 gun sonra tarihi soyler

        System.out.println(tarih.minusWeeks(20));//
        System.out.println(tarih.plusDays(100).plusMonths(5));//100 gun 5 ay oceki tarih

        System.out.println(tarih.isAfter(tarih2));//true


        //iki frakli dogumtarihi girildiginde
        //hangi doganin buyukoldugunu bulunuz// bu soruyu if elselle yapmaya calis
        // tarih2 ve tarih 3 icin yapalim
        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else {
            System.out.println("iki tarih birbiri ile ayni");

            LocalTime time=LocalTime.now();
            System.out.println(time);


        }


    }

}