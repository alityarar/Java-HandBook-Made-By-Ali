package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,8,6,4,8,57,34,6,3};
        int istenensayi=3;

        //Eger Javadan hazir Binaryseach ile yapmak istersek
        //once sort methodunu kullanip,sonra binary search yapmaliyiz
        //BinarySearch() bize istenen sayinin oldugu indexi verir ZORUNLU


        Arrays.sort(arr);  //kucukten buyuge siraladik
        System.out.println(Arrays.toString(arr)); //sirali halini yazdirdik
        System.out.println(Arrays.binarySearch(arr,istenensayi));
        //istenen sayinin ilk kullanildigi indexi verir

        //Eger olmayan bir elementi aratirsak
        //Java bulamadigin gostermek icin - isareti koyar
        //sonra da o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir

    }
}
