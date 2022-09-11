package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        /*
        Verilen bir array in tekrar eden elementlerini sadece 1 kere yazdiran
        bir method olusturun.
         */
        int arr[]={3,4,6,8,7,7,5,9,0,4,3,7,7};
        arrayiTekrarsizYazdir(arr);
    }

    private static void arrayiTekrarsizYazdir(int[] arr) {
        Set<Integer> tekrarsizElementKumesi=new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElementKumesi.add(each);

        }
        System.out.println(tekrarsizElementKumesi);

        /*
        Arama bulma kolay olmasi icin == HashSet
        Ekleme Cikarma kolay olmasi icin ==LinkedHashSet
        Siralama bizim icin onemliyse ==TreeSet

         */
    }
}
