package day12_okulProjesiCalisma;

public class Ogretmen extends Kisi {
    private String ogrtmnBrans;
    private String ogrtmnSicinNo;

    public Ogretmen(){}
    public Ogretmen(String isimSoyisim, String kimlikNo, int yas, String ogrtmnBrans, String ogrtmnSicinNo) {
        super(isimSoyisim, kimlikNo, yas);
        this.ogrtmnBrans = ogrtmnBrans;
        this.ogrtmnSicinNo = ogrtmnSicinNo;
    }



    public String getOgrtmnBrans() {

        return ogrtmnBrans;
    }

    public String getOgrtmnSicinNo() {

        return ogrtmnSicinNo;
    }

    public void setOgrtmnBrans(String ogrtmnBrans) {
        this.ogrtmnBrans = ogrtmnBrans;
    }

    public void setOgrtmnSicinNo(String ogrtmnSicinNo) {
        this.ogrtmnSicinNo = ogrtmnSicinNo;
    }


    @Override
    public String toString() {
        return
                "ogrtmnBrans=" + ogrtmnBrans +
                "ogrtmnSicinNo='" + ogrtmnSicinNo +  super.toString();

    }
}

