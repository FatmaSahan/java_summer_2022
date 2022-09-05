package day33_encapsulation;

public class ArabaRunnerCalisma {
    public static void main(String[] args) {
        ArabaCalisma araba=new ArabaCalisma();
        araba.marka="toyota";
        //degistirdim(set) ve yazdirdim(get)
        System.out.println(araba.marka);
        araba.setModel("supra");//supra olarak degistirdik
        System.out.println(araba.getYakit());//yakiti getirdik

    }
}
