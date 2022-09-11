package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        //10 elementli bir list olusturalim

        //EN KOLAY ARRAYI LIST YAPMAK

        int arr[]={1,2,4,7,5,3,6,8,4,22};

        List<Integer> sayilar=new ArrayList<>();

        for (int each:arr
             ) {
            sayilar.add(each);

        }
        System.out.println(sayilar);

        //sayilar listesinde 3 e bolunemeyen sayilari for-each loop ile yazdiralim

        for (int each:sayilar
             ) {
            if (each%3!=0){
                System.out.print(each+" ");
            }

        }
    }
}
