package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_ListedenTekrarliElemanlariSilme {
    public static void main(String[] args) {

        //verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        //bir method olusturun
        //orn ; [1,3,5,6,3,5,2,1,7]
        //output; [1,2,3,5,6,7]

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar);


    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsizList= new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {
            if (!tekrarsizList.contains(sayilar.get(i)));
            tekrarsizList.add(sayilar.get(i));

        }
        System.out.println(tekrarsizList);
    }

}
