package interviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q01 {

    //STRINGDEKI HER HARFIN KACAR DEFA YAZILDIGINI GOSTEREN KOD

    public static void main(String[] args) {
        String str = "abarabbarrdggsss";

        String arr[]=str.split(""); //Her bir karakteri ayirir

        System.out.println(Arrays.toString(arr));

        //Sort()      SIRALAMA

        Arrays.sort(arr);  //Array siralandi
        System.out.println(Arrays.toString(arr));

        //Sayac olusturma

        int counter=0;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.print(arr[i-1]+(counter+1));
                counter=0;
            }
           // if (i==arr.length-1){   //En sona geldiginde demek
           //     System.out.println(arr[i]+(counter+1));
           // }

        }







    }
}
