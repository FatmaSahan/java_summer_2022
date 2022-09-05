package day33_encapsulation;

public class ArabaCalisma {
    String marka="belirtilmedi";
    private String model="model belirtilmedi";
    private String yakit="elektrikli";

    public void setModel(String model) {
        this.model = model;//deger atamaya
    }

    public String getYakit() {//ulasmaya izin verir
        return yakit;
    }
}
