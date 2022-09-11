package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7); //[7,5,3]
        sayilar.add(2,7); //[7,5,7,3]

        sayilar.remove(3); //index olarak 3 deki elementi siler
        //sayilar.remove(5); //IndexOutOfBoundsException

        /*
        Sayilardan olusar bir list'te objeyi vererek element silme methodu calismaz
        sayi degeri girdigimizde Java otomatik olarak index kabul eder
         */

        int sayi=5;
       // sayilar.remove(sayi); //IndexOutOfBoundsException

        Integer sayi1=5; //Integer wrapper classi kullaninca sayi obje oldugunden bu method calisti
        sayilar.remove(sayi1);
        System.out.println(sayilar); //[7, 7]
        //Bu sekilde yazarsak olur cunku suan obje oldu

        //sayilar.remove(Integer.valueOf("5"));
        //Bu da calisir


    }

}
