package Practice4_MetohdCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //cm olarak verilen bir veriyi metre ve kilometreye cevuren method yaziniz  Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
               System.out.print("metre ve km ye donusturmek istediginiz cm degeriniz girinzi :");
               double santiMeterValue= scan.nextDouble();
                convertSM(santiMeterValue);
          }
          private static void convertSM(double santiMeterValue) {
              double meter = santiMeterValue/100;
               double kMeter =santiMeterValue/100000;
               System.out.println("girdiginiz santimetre degeri :" +santiMeterValue +" :" + meter + " m dir, " + kMeter + " km dir");




    }
}
