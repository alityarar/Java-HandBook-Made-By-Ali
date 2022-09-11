package day46_itelator_collections;

import java.util.*;

public class C02_ListeninElementleriniArttirma {
    public static void main(String[] args) {
        //verilen listdeki her elementi 3 arttirin

        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        /*
        Listenin tum elementlerini bize getirmesi icin iteratorun
        hasNext() ve next() methodlarini kullanacagiz
         */

        Iterator itr=liste.iterator();

        while(itr.hasNext()){ //yaninda element oldugu surece calisacak
            System.out.print(itr.next());
        }



        ListIterator itr2=liste.listIterator();

        while (itr.hasNext()){
            Object sayi = itr2.next();
            itr2.set((Integer)sayi+3);
        }
        System.out.print(liste);

    }
}
