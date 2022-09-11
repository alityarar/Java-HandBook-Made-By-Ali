package day22_arrays;

import java.util.Arrays;
import java.util.Locale;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,8,6,4,8,56,34,6,};
        // verilen bir arayi buyukten kucuge siralayip yazdiran bir method olusturun

        String str="AsdjJl";
        str=str.toUpperCase(Locale.ROOT);
        System.out.println(str);

        arr=terstenSirala(arr);
        System.out.println(Arrays.toString(arr));

        //METHOD KULLANIMI ORNEGI
        str=kucukYap(str);
        System.out.println(str);
        String str2="gFsdD";
        str2=kucukYap(str2);
        System.out.println(str2);
        String str3="dsfjJHHFUH";
        str3=kucukYap(str3);
        System.out.println(str3);

        int sayi=0;
        ucebolunme(sayi);
        int sayi2=450;
        ucebolunme(sayi2);
        System.out.println(sayi2);
        ucebolunurmu(sayi2);

        int sayi5=4648;
        ucebolunurmu(sayi5);
        System.out.println(sayi5);
        String str5="dsfffhfbro";
        if (str5.contains("bro")){
            System.out.println("evet");
        }




    }

    private static void ucebolunurmu(int sayi2) {
        if (sayi2%3==0){
            System.out.println("Bu sayi uce tam bolunebilir");
        }else{
            System.out.println("Bu sayi uce tam bolunemez");
        }
    }

    public static void ucebolunme(int sayi) {
        for (int i = sayi; i >0 ; i--) {
            if (i%3==0){
                System.out.print(i+" ");
            }

        }
    }

    private static String kucukYap(String str) {
        str=str.toLowerCase(Locale.ROOT);
        return str.toLowerCase(Locale.ROOT);
    }

    public static int[] terstenSirala(int[] arr) {

        Arrays.sort(arr);
        int tersArr[]= new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {

            tersArr[i] = arr[arr.length - 1 - i];
        }
        return tersArr;
    }
}
