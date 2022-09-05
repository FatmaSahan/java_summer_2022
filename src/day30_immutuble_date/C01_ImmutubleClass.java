package day30_immutuble_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutubleClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kenan");
        list.add("Enes");
        list.add("Ismail");
        System.out.println(list); // [Kenan, Enes, Ismail]
        list.set(1,"Yasemin");
        System.out.println(list); // [Kenan, Yasemin, Ismail]
        list.remove("Ismail");
        System.out.println(list); // [Kenan, Yasemin]
        list.add("fatma");
        System.out.println(list);//[kenan,yasemin,fatma]
        list.remove("Kenan");//[yasemin,fatma]
        System.out.println(list);
        list.set(0,"senih");
        System.out.println(list);

    }
}
