package day12_OkulProje;

public class Ogrenci extends Kisi {//CONST CONTROL EDILECEK
    private String ogrenciNo;
    private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo,String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif=sinif;
    }
    public Ogrenci(){}//DEFAOULT CONSRUCTUR

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "(Ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}'+super.toString();
    }
}
