package day34_inheritance;

public class Isci extends Personel {//exdens ve parent yapmak istedigimklasin adini yazariz
//artik bu klasdan obje olusturarak parentsdaki tum bilgileri kullanabilirim
    public static void main(String[] args) {
        int persNo=1001;

        Isci isci1=new Isci();
        System.out.println(isci1.persNo);//kendi klasimizda varsa once bu variable kullanir

        System.out.println(isci1.isim);
        isci1.isim="fatma";//atamada yapabiliriz

        isci1.maas();//parenttaki metodu kulandik



    }
    public void maas(){
        System.out.println("isciler min 15£ ucret alirlar");//maasi bu sekilde specific hale getirebiliriz
    }
    public void ozelSigorta(){
        System.out.println("iscilerden isteyene %50 indirimli ozel sigorta yapilir");
        //parent clasdaki ozelliklerin disindaki bazi yeni
        // ozellik yani variabla yada metod olusturabilir

    }
}
