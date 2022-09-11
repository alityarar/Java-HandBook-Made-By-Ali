package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C06_ListdenIstenmeyenElementleriSilme {
    public static void main(String[] args) {
        //Verilen bir arrayden istenen elementi silip, kalanlari
        //yeni bir array olarak yazdiran yeni bir method olusturun
        int arr[]={3,4,2,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        istenmeyenElementiSilveYazdir(arr,istenmeyenEleman);
    }

    public static void istenmeyenElementiSilveYazdir(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                yeniList.add(arr[i]);
            }

        }
        System.out.println(yeniList);
    }
}
