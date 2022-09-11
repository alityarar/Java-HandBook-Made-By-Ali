package day47_linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List den gelen ozellikleri biliyoruz
        //onun icin Deque den gelen ozelliklere bakalim
        Deque<Integer> ll1=new LinkedList<Integer>();
        ll1.addFirst(10); //basa element ekler, add methoduna gora daha hizlidir
        ll1.addLast(4); //sona element ekler, add methoduna gore daha hizlidir
        System.out.println(ll1);
        System.out.println(ll1.element());  //ilk elementi silmeden bize dondurur
        System.out.println(ll1);


    }
}
