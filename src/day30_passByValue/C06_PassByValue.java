package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));

        arrDegistir(arr);
    }

    private static void arrDegistir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }
}
