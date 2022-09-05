package day12_okulProjesiCalisma;

public class Kisi {
    private String isimSoyisim;
    private String kimlikNo;
    private int yas;

    public Kisi(String isimSoyisim, String kimlikNo, int yas) {
        this.isimSoyisim = isimSoyisim;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }
    public Kisi(){

    }

    public String getIsimSoyisim() {

        return isimSoyisim;
    }

    public String getKimlikNo() {

        return kimlikNo;
    }

    public int getYas() {

        return yas;
    }

    public void setIsimSoyisim(String isimSoyisim) {

        this.isimSoyisim = isimSoyisim;
    }

    public void setKimlikNo(String kimlikNo) {

        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas)
    {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "isimSoyisim='" + isimSoyisim +
                ", kimlikNo='" + kimlikNo +
                ", yas=" + yas
                ;
    }
}
