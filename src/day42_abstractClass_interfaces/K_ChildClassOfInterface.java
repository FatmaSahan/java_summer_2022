package day42_abstractClass_interfaces;

public class K_ChildClassOfInterface implements I02_interFaces,I03_interface{
    /*
     Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
     implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
    */
    public static void main(String[] args) {
        System.out.println(I02_interFaces.SAYI);
        System.out.println(I03_interface.SAYI);
        System.out.println(ISIM);


    }
}




