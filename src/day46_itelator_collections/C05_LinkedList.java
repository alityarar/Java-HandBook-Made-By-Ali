package day46_itelator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //hem List hem de Queue nun child classidir
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        //add methodu List den geldigi icin hep sona ekler
        list.addFirst(11); //addFirst deque den gelir
        list.addLast(3);//addLast deque den gelir

        System.out.println(list);
        list.add(2,3);
        System.out.println(list);
    }
}
