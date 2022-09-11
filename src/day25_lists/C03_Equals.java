package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Equals {
    public static void main(String[] args) {
        //iki listteki elemanlarin hem indexleri hem de kendileri tamamen
        //ayni mi diye kontrol etmeye yarar

        List<String> first=new ArrayList<>();
        List<String> second=new ArrayList<>();
        System.out.println(first.equals(second)); //true

        first.add("a"); //[a]
        System.out.println(first.equals(second)); //false

        second.add("a");
        System.out.println(first.equals(second)); //true

        first.add("b");//[a,b]
        second.add(0,"b"); //[b,a]
        System.out.println(first.equals(second)); //false cunku indexleri farkli

        //Sort ile siralanirsa duzelir


    }


}
