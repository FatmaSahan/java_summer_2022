package day25_consrctur;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();//OBJE
        car1.fiyat=150000;
        car1.marka="toyota";
        car1.yil=2020;
        System.out.println("marka:"+car1.marka+"\nmodel:"+car1.model+"\nyil:"+ car1.yil+"\nfiyat;"+ car1.fiyat);

        Car car2=new Car();
        System.out.println("marka:"+car2.marka+"\nmodel:"+car2.model+"\nyil:"+ car2.yil+"\nfiyat;"+ car2.fiyat);




    }
}
