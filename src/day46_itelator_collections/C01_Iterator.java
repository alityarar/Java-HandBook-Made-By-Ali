package day46_itelator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); //[5, 7, 8, 6, 9]

        Iterator itr=liste.iterator();


        /*
        Iterator methodunu olusturdugumuz liste objesi uzerinden
        ArrayList classindan calistiriyoruz

        Iterator Nasil Calisir?

        Bir Iterator objesi olusturmak icin collection uyesi bir obje
        kullanmaliyiz. Yani biz bu iterator objesini bizim ornegimizde
        liste objesi uzerinde calismak icin olusturmus olduk.

        Biz iterator objesini olusturdugumuzda, iterator collection in
        ilk elementinin oncesine gidip bekler.

        [(itr)5, 7, 8, 6, 9]

        itr.hasNext()== true ==== iteratora yaninda eleman var mi diye sorar
        true yada false dondurur


        itr.next()===iterator bir sonraki elementin yanina gecer ve uzerinden
        gectigi elementi bize dondurur.
         */
        System.out.println(itr.next()); //5
        System.out.println(itr.next()); //7
        System.out.println(itr.next()); //8
    }
}
