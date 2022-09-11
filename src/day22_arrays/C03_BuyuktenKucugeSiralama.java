package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        //verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
        int arr[]={3,4,5,6,8,6,4,8,56,34,6,};
        terstenSiralaYazdir(arr);
        terstenYazdir(arr);

    }

    public static void terstenYazdir(int[] arr) {
        int terstenYazdirArr[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            terstenYazdirArr[i]=arr[arr.length-1-i];

        }

    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr);
        int tersArr[]= new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {

            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));
    }
}
