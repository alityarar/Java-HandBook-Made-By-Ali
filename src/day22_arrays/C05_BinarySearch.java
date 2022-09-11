package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        //Verilen arrayde istenen bir elementin var olup olmadigini
        //true/false yazdirarak gosteren bir method olusturun

        int arr[]={3,4,5,6,8,6,4,8,57,34,6,};
        int istenensayi=7;
        istenensayi(arr,istenensayi);
        istenenBoolu(arr,istenensayi);


    }

    private static void istenenBoolu(int[] arr, int istenensayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenensayi){
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);

    }

    private static void istenensayi(int[] arr, int istenensayi) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenensayi){
                System.out.println("true");
                break;
            }
            //Bu method calisiyor gibi gorunse de aslinda false yazdiramayiz
            //Cunku tarayip gordugu her false da yazdiracaktir
            //o yuzden bir boolean olusturup onun uzerinden bir loop yapiyoruz


        }


    }
}
