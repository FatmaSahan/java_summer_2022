package day12_okulProjesiCalisma;

public class Ogrenci extends Kisi{
    private String ogrenciNo;
    private String ogrenciSinif;


    public Ogrenci(String isimSoyisim, String kimlikNo, int yas, String ogrenciNo, String ogrenciSinif) {
        super(isimSoyisim, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.ogrenciSinif = ogrenciSinif;
    }
    public Ogrenci(){}

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
    public void setOgrenciSinif(String ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;}

    @Override
    public String toString() {
        return
                "ogrenciNo:" + ogrenciNo +
                " ogrenciSinif=" + ogrenciSinif + super.toString();

    }
}




