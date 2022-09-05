package day40_final;

public class A {
    protected  String isim="Cuneyt";
    final String okul="yildiz koleji";
    final static  String OKUL="Yildiz Koleji";//FINALOLDUGU ICIN BASKA KLASLARDAN DEGISTIREMEYIZ

    /*bir variable final olarak tanimlandiysa baska
    klaslardan veya icinde oldumuz klaslardan  bu variabla baska
    deger atanmasi mumkun degildir.mademki degeri degistirilemiyo genelde
    static yaparak bu variabla erisim kolaylastirilabilir
    genelde static final olarak belirlenen variable isimleri buyuk yazilir
     */
    final void finalMethod(){
        System.out.println("final metodhlar override edilemez");//ETKISIZ HALE GETIREMEYIZ
    }
}
