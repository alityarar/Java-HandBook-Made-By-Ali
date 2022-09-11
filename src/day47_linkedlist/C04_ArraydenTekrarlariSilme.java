package day47_linkedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir Arrayden tekrar eden elementleri silip
        //unique elementlerden olusan bir Array haline donduren bir method yazin

        int arr[]={3,4,6,8,7,7,5,9,0,4,3,7,7};

        arr=benzersizYap(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] benzersizYap(int[] arr) {

        //Set te index yapisi yoktur, o yuzden forloop kullanamayiz

        Set<Integer> benzersizSet=new HashSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);

        }
        System.out.println(benzersizSet);
        return arr;
    }
}
