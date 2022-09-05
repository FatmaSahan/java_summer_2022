package day41_abstractClass_interFace;

public abstract class DAraba {
    public static void main(String[] args) {
        /*abstract clasda main method opsiyoneldir
        eger abstract class sadece child claslarin tasimak zorunda oldugu ozellikleri belirlemek icin
        olusturulduysa main metoda ihtiyacimiz olmaz
        sadece abstract metodlar olur

        ama bir abstract methoda standart belirlemek disinda da methodlar calisabilir
        bu durumda ihtiyac olursa main method olusturulabilir

         */

    }
    protected abstract void motor();//SOYUT METOD
    //sadece child claslarin mecburi tasiycaklari
    //ozellikleri belirleyen methodlar abstract method olur ve abstract methodlarin body si olmaz

    public void klima(){//CONCERETE METOD
        System.out.println("bazi arabalrda klima olabilir");
        /*abstract olmayan methodlara CONCERETE denir
        ABSTRACT BIR METODU ABSTRACT KEYWORDU ILE BELIRTMEK ZORUNLUDUR
        CONCERETE METODLARDA BUNUN DEKLARE EDILMESINE GEREK YOKTUR

         */
    }
}
