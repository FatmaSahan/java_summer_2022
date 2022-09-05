package day14_methodCreation;

public class C01_MetodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir sitringi tersten yazdiralim
        //neden void yaziyoruz ?? cunku bizden sadece yazdirmamizi istemis

        terstenYazdir("okan");
        // buraya methods call denir
        // argumentsleri istedigimgibi degistirip
        // asagidaki metodu cagirarak kelimeyi tersten yazdirabiirim
        //BURDAN DUNKU DERSIN 4. CLASDAKI METODUDA CAGIRIP KULLANABILIRIZ

    }
    public static void terstenYazdir(String Input){
        String tersInput=Input.substring(3)+
                Input.substring(2,3)+
                Input.substring(1,2)+
                Input.substring(0,1);
        System.out.println("Girdigimiz kelimeninin  tersi:"+tersInput);
    }
}
