package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";
        System.out.println(str.indexOf('g'));                 // 6  indexof> gordugu ilk g nin  index'ini verir
        System.out.println(str.indexOf('r'));                 // 7 (saymaya 0 dan aslar)
        System.out.println(str.indexOf("j"));                 //-1 yok demektir ( kucuk j olmadigi icin)

        System.out.println(str.indexOf("mek"));              // 10 "nek "in ilk harfini dondurur(blok oarak dusunur)

        System.out.println(str.indexOf("g",6));  //6 (grenmek cok guzeldiri kapsar ve bu cumlede ilk g yine 6 da oldugu icin tekrr 6 yazdirir
                                                               // Bu yuzdeb (6+1) yazmaliyiz
        System.out.println(str.indexOf("g", (6 + 1)));     // 11 yazilan indexden baslar

        // 2. ve 3.e nin indexini bulun

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);

        //eger 2. e varsa 3. e nin olup olmadigini ve varsa index 'ini yazdiralim

        if(ikincie==-1) {
            System.out.println(" str da ikinci e yoktur");
        }else {
            int ucuncue = str.indexOf("e", ikincie + 1);
            if (ucuncue == -1) {
                System.out.println("verien str da ucuncu e yoktur");
            }else{
                System.out.println("ucuncue:"+ucuncue);
            }
            }




        }}
