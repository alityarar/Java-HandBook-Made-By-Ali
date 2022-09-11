package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {
        String arr[]={"S","M","A","T"};
        String str="Araba";
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Java'da bu siralamaya Natural Order denir.
        //Sayi olursa kucukten buyuga
        //metin olursa alfabetik siralamaya gore

    }
}
