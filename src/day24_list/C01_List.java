package day24_list;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr[]={};
        //bu array e 5 ekleyelim
       arr= C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr)); // [5]

        arr=C06_Arrays.arrayeElemanEkle(arr,6);
        System.out.println(Arrays.toString(arr)); // [5, 6]


        //bir list olusturalim

        List<Integer> sayilarList=new ArrayList<>();
        System.out.println(sayilarList); //[]

        sayilarList.add(5); //[5]
        sayilarList.add(3); //[5,3]
        sayilarList.add(0,7); //[7,5,3]
        sayilarList.add(2,7); //[7,5,7,3]
        System.out.println(sayilarList); // [7,5,7,3]




        //-------size---------
        //Arraylist de kac eleman oldugunu gosterir

        System.out.println(sayilarList.size());
        //bos list 0 dir




        //-------isEmpty--------
        //Arraylist bos ise true, bos degilse false doldurur
        System.out.println(sayilarList.isEmpty()); //false





    }
}
