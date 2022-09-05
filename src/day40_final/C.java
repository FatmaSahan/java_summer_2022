package day40_final;

public abstract class C {//CLASIN BASINA ABSTRACT YAZARSAK ABSTRACT OLUR
    // VE ABSTRACT CLASLAR METODLARLA ILGILIDIR
    void toplama(){
        System.out.println("bu method toplama yapar");

    }
    abstract void carpma();
    /*bir metodun basin aabstract yazarsaniz bu methodun child claslar icin butr standart
    oldugunu declare ederiz
     */

    abstract void bolme();//absract metodlarin budysi olmaz
    abstract void  cikarma();//ya abstracti yada budyi silmeliyiz


}
