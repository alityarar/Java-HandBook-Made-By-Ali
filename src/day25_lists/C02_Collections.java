package day25_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_Collections {
    public static void main(String[] args) {
        //bu method arraylist deki elemanlari kucukten buyuge yada
        //alfabetik siraya gore siralar

        List<String> hayvan =new ArrayList<String>();
        hayvan.add("Yilan");
        hayvan.add("Kedi");
        hayvan.add("Tavsan");
        System.out.println(hayvan); //[Yilan, Kedi, Tavsan]

        Collections.sort(hayvan);
        System.out.println(hayvan); //[Kedi, Tavsan, Yilan]
    }
}
