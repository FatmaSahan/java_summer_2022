package day40_final;

final public class B extends A {
    public static void main(String[] args) {
        B obj=new B();
        obj.isim="Alp";
       // obj.okul="java koleji"; //final oldugu icin assign yapamayiz

        System.out.println(A.OKUL);
        System.out.println(Integer.MAX_VALUE);
        //BIR CLAS FINAL YAPILIRSA O KLAS INHERIT EDILEMEZ ARTIK


    }

}
