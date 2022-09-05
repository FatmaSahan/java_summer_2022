package day10_practice;

public class ogretmenbilgileri_calis {
    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    public ogretmenbilgileri_calis(String isim, String soyisim, Integer yas, String brans, String tel) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.brans=brans;
        this.yas=yas;
        this.tel=tel;
    }

    @Override
    public String toString() {
        return "Ogretmen Bilgileri_calis{" +
                "isim:'" + isim + '\'' +
                ", soyisim:'" + soyisim + '\'' +
                ", yas:" + yas +
                ", brans:'" + brans + '\'' +
                ", tel:" + tel + '\'' +
                '}';
    }
}
