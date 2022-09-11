package day45_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);

        //for each kullanarak her elementi 2 arttiralim

        for (Integer each:liste
             ) {
            each=each+2;

        }
        System.out.println(liste);

        Iterator itr= liste.iterator();
    }
}
