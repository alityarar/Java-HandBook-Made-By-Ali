package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C10_List {
    public static void main(String[] args) {

        //Bir lsitede ortalamanin ustinde olan element sayisini bulunuz

        List<Double> sayilar=new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(2.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(7.0);

        //ortalamayi bul

        Double ortalama=0.0;
        Double toplam=0.0;

        for (int i = 0; i <sayilar.size() ; i++) {
            toplam+=sayilar.get(i);

        }
        ortalama=toplam/sayilar.size();
        System.out.println(ortalama);

        //ortalamanin ustunde olanlari bir liste at

        List<Double> ortalamaninUstindekiler = new ArrayList<>();

        for (int i = 0; i <sayilar.size() ;i++) {
            if (sayilar.get(i)>ortalama){
                ortalamaninUstindekiler.add(sayilar.get(i));
            }

        }
        System.out.println(ortalamaninUstindekiler);

    }
}
