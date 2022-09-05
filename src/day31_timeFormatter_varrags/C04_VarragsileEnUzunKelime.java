package day31_timeFormatter_varrags;

public class C04_VarragsileEnUzunKelime {
    public static void main(String[] args) {
        //ONEMLIII:varrags bir arraydir
        //Varragsin uzunlugu esnektir
        //list gibi calisir fakat arraydir
        enUzunKelimeyiyazdir("Ali","AYSE","ISMAIL","AHMET");//istedigimiz kadar isim ekleyebiliriz
    }
                                      //uc noktayi gorunce varrags var diycez
    public static void enUzunKelimeyiyazdir(String...kelime) {
        String enUzunKelime=kelime[0];
        for (String each:kelime
             ) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }
        System.out.println("girilen kelimenin en uzunu:"+enUzunKelime);
    }
}
