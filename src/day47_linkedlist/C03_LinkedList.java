package day47_linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1=new LinkedList<>();

        //System.out.println(ll1.element()); Bosken kullanirsak exception firlatirection

        System.out.println(ll1.peek()); //bastaki elementi dondurur,yoksa null verir

        System.out.println(ll1.poll()); //ayni sekil null verir

        System.out.println(ll1.pop()); //ilk  elementi bulur, siler ve dondurur.
                                       //yoksa exception firlatir


    }
}
