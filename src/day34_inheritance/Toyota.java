package day34_inheritance;

public class Toyota {
    //genel ozellikleri bu raya yazalim
   protected String marka="Toyota";
    private String model="belirtilmedi";
   protected String yakit="belirtilmedi";
   protected void motor(){
       System.out.println("toyota cevreci motorlar");
   }
   protected void aku(){
       System.out.println("toyota modele gore aku kullanir");

   }
}
