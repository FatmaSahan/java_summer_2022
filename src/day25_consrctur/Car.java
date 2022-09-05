package day25_consrctur;

public class Car {
    //burayi kaliphane gibikullanicaz variable yada methodlari buraya yazalim
   public String marka="marka belirtilmedi";
   public String model="model belirtilmedi";
   public int yil;
   public int fiyat;
    //asagidaki metodu olusturmak zorunda degliz.maksat bulunsun istedik
    public void benzinliArac(){
        System.out.println("bu arac benzinlidir");

    }
    public void MaxHiz(int Hiz){
        System.out.println("bu arac MAX"+Hiz+"yapar");
    }


}
