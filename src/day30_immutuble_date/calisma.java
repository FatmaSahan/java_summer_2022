package day30_immutuble_date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class calisma {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.isLeapYear());

        LocalDate tarih2=LocalDate.of(1984,11,16);
        System.out.println(tarih2.getDayOfYear());
        LocalDate tarih3=LocalDate.of(2009,8,4);
        LocalDate tarih4=LocalDate.of(2011,1,7);
        if(tarih4.isAfter(tarih3)){
            System.out.println(tarih3+"te dogan daha buyuktur");
        } else if (tarih4.isBefore(tarih3)) {
            System.out.println(tarih4+"te dogan daha buyuktur");

        }else System.out.println("iki dogan ayni yastatir");

        LocalTime time=LocalTime.now();
        System.out.println(time);
        Period period=Period.between(tarih3,tarih4);
        System.out.println(period);//1 yil 5 ay 3 gun
        Period kacYas=Period.between(tarih2,tarih3);

        System.out.println(kacYas);//24 yil 8 ay 19 gun

    }
}
