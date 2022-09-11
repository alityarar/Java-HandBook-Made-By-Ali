package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Clear {
    public static void main(String[] args) {
        //ArrayList teki tum elemanlari siler
        //Return type i void dir, hic bir sey donmez

        List<String> hayvan =new ArrayList<String>();
        hayvan.add("Yilan");
        hayvan.add("Kedi");
        hayvan.add("Tavsan");
        System.out.println(hayvan); //[Yilan, Kedi, Tavsan]

        System.out.println(hayvan.isEmpty()); //false

        System.out.println(hayvan.size()); //3

        hayvan.clear();
        System.out.println(hayvan.isEmpty()); //true
        System.out.println(hayvan.size());  //0

    }
}
