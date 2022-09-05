package day27_staticKeyword;

public class C01 {
    static int sayi=10;//(static)
    int rakam=5;//(instance)(obje kullanarak cagirabiliriz bu variable)
    //clas levelda ikitur variable olusturabiliriz
    //static(clas) variable
    //instance(obje) variablar
    //sattic variablar tum claslardan kullanilabilr
    //instanclar static olmayan metodlardan kullanirlar
    //instancelara staticlerden ulasmakistersek obje olusturmaliyiz

    public static void main(String[] args) {
        C01 obj1=new C01();
        System.out.println("obj1 nin rakamdegeri:"+obj1.rakam);//5
        System.out.println("obj1 nin sayi degeri:"+sayi);//10
       // rakam+=1;//rakam instance olduguicin static mainde kullannmayiz
        obj1.rakam+=1;//instance oldugu icin objeyle cagirdik
        sayi+=1;//static bunu normal yazazriz
        System.out.println("1 arttiktan sonra rakamdegeri:"+obj1.rakam);//6
        System.out.println("1 arttiktan sonra sayi:"+sayi);//11

        C01 obj2=new C01();
        System.out.println("obj 2 nin rakam degeri:"+obj2.rakam);//5(instancen takibi objenin olusturulmasindan sonra baslar)
        System.out.println("obj2 nin sayi degeri:"+obj2.sayi);//11(sayi static yani clas variabla olduguicin takibi clasdan baslar)

        obj2.rakam++;//5+1=6
        obj2.sayi++;
        System.out.println("1 arttiktan sonra obj2 nin rakam degeri"+obj2.rakam);//6
        System.out.println("1 arttiktan sonra obj2 sayi degeri"+obj2.sayi);//12
        //DIKKT INSTANCCE OBJEDE BASLAR OBJEDE BITER STATICSE CLASDA BASLAR CLASDA BITER



    }

}
