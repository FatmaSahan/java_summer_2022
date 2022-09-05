package day37_overridding;

public class EToyota extends DAraba{
   void marka(){
       //super.marka()
       //eger hem overridden hemde overrridding metodun calismasini istersek ilk satira
       //super.marka yazabiliriz//super demek parettakine git demek
       System.out.println("markamiz toyota");
   }
   void motor(){
       System.out.println("toyota araclar toyota marka motor kullanir");
   }

}
