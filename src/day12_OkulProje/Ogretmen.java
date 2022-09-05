package day12_OkulProje;

public class Ogretmen extends Kisi {
    private String bolum;//FARKLI CLASLRDA CALISTIGIM ICIN PRIVATE CUNKU OZEL BILGILER VAR SICIN NO GIBI
    private String sicilNo;
    public Ogretmen(){}//DEFAULT CONST.

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);//PARENTENDAN ALIYOR(KISI)
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}'+super.toString();
    }
}

