package recap02Elif;

public class C08_NestedIfandTernary {
    public static void main(String[] args) {
        //0 ile 9 arasindaki sayilari cevirebilen bir java programi yaziniz
        // 0 dan kucuk yada 9 dan buyuk ise "GECERSIZ" yazdirin
        //1 ise bir
        //2 ise iki gibi...
        int rakam=0;
        if(rakam>=0 && rakam<=9){
        switch (rakam){
            case 0:System.out.println("sifir");break;

            case 1: System.out.println("bir");break;

            case 2: System.out.println("iki");break;

            case 3:System.out.println("uc");break;

            case 4: System.out.println("dort"); break;
            case 5:System.out.println("bes");break;

            case 6:System.out.println("alti"); break;

            case 7:  System.out.println("yedi"); break;

            case 8: System.out.println("sekiz"); break;

            case 9: System.out.println("dokuz");break;
        }
    }else {
            System.out.println("GECERSIZ SAYI");
    }
        //ternary le cozelim
        int sayi=10;
        String result=sayi==0?"sifir":sayi==1?"bir":sayi==2?"iki":sayi==3?"uc":sayi==4?"dort":sayi==5?
                "bes":sayi==6?"alti":sayi==7?"yedi":sayi==8?"sekiz":sayi==9?"dokuz":"gecersiz";
        System.out.println("result:"+result);



    }}
