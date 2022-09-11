package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String isim="Bey";

        String arr1[]={"Ali","Veli",isim};
        //Array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]); //ali

        arr1[1]="Esila";
        System.out.println(arr1[1]); //Esila

        //Array in icindeki indexi kullanarak elementlere ulasabilir ve
        //update edebiliriz

        int arr2[]=new int[4];

        System.out.println(arr2[1]); //0
        System.out.println(arr2[3]); //0
        //System.out.println(arr2[5]); //hata verir ArrayIndexOutOfBounds


        //Array in tamamini yazdirmak istersek

        System.out.println(arr2); //[I@57829d67
                                  //Array ler non-primitive olduklarindan direk
                                  //yazdirmak istersek, java referans bilgisini yazdirir

        for (int i = 0; i <4 ; i++) {
            System.out.println(arr2[i]+" ");

        }
        System.out.println("");

        //Array i yazdirmak icin Javadaki Arrays classindan toString() kullanilir

        System.out.println(Arrays.toString(arr2)); //[0,0,0,0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); // [0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1)); //[Ali, Esila, Murat]

        int sayi1=34;
        arr2[0]=sayi1;
        System.out.println(Arrays.toString(arr2));


    }
}
