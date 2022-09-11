package day47_linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        LinkedList in 2 tane parent Interface i vardir.
        LinkedList olustururken data turu olarak LinkedList secersek;
        iki parentdaki tum methodlar kullanilir
        List secersek; sadece List Interfaceindeki methodlar kullanilir.
        Deque/Queue secersek; Deque deki methodlari kullanabiliriz

         */

        LinkedList<Integer> ll1=new LinkedList<Integer>();
        ll1.add(10); //LinkedList classindan bu methodu calistirir

        //Sadece List interface inden ozellikler kullanmak istersek

        List<Integer> ll2=new LinkedList<Integer>();
        ll2.remove(0);

        //Sadece Deque den gelen ozellikleri kullanmak istersek

        Deque<Integer> ll3=new LinkedList<Integer>();

        ll3.addFirst(2);
        ll3.add(4);

    }
}
