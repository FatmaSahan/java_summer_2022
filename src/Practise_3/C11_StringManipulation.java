package Practise_3;

public class C11_StringManipulation {
    public static void main(String[] args) {
        /*name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.

        name1= mehmet
        name2= ahmet
        Print ==> mehahmetmet
      */
       String name1="zekeriya";
       String name2="betul";
       if(name1.length()%2==0){
           String name3=name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2);
           System.out.println(name3);
       }else {
           System.out.println("nume1 in karakter sayisi cift degildir");
       }


    }}

