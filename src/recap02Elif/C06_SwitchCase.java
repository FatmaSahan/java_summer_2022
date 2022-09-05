package recap02Elif;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //gunleri gosteren bir program yazin
        //gun pzrtesi yada sali ise:java dersi gunleri
        //gun persembe yada cuma ise:selenyum ders gunleri
        //gun carsamba yada cumartesi ise:SQL dersleri
        //aksi halde: izin gunu
        //not :if kullanmayin

        String gun = "pazar";
                 //gunu burdan degistirabiliriz

        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("java ders gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("selenyum ders gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL ders gunleri");
            default:
                System.out.println("izin gunleri");
        }

    }
}
