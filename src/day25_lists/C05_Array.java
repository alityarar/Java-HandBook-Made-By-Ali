package day25_lists;

import java.util.Arrays;

public class C05_Array {
    public static void main(String[] args) {
        //Verilen bir arrayden istenen elementi silip, kalanlari
        //yeni bir array olarak yazdiran yeni bir method olusturun

        int arr[]={3,4,2,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        istenmeyenElementiSil(arr,istenmeyenEleman);
    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        int sayilar;


    //1-istenmeyen element sayisini bulalim
    int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }

        }
        //2- Yeni arrayi olusturalim
        int yeniarray[]=new int[arr.length-sayac];

        //3- Eski arrayden uygun elementleri yeniye tasi
        int index=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                yeniarray[index]=arr[i];
                index++;
            }

        }
        //4-yeni arrayi yazdiralim
        System.out.println(Arrays.toString(yeniarray));






    }
}
