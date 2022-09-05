package day12_OkulProje;

public class Kisi {
    private String adSoyad;//encapcule ettik
    private String kimlikNo;
    private int yas;//herkesin ortak ozelligi
//CONSTUCTUR OLUSTURDUK
    public Kisi(String adSoyad,String kimlikNo,int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo=kimlikNo;
        this.yas=yas;
    }
    public Kisi(){}
    //DEFAULT CONSRUCTUR OUSTURDUK


    public String getAdSoyad() {
        return adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas) {//YAS KONTROLU YAPIINIZ
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
