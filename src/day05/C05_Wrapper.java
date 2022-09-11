package day05;

import java.util.Locale;

public class C05_Wrapper {
    public static void main(String[] args) {

        //primitive data turu ile non arasindaki farklar nelerdir

        //non data turleri data depolama yaninda bir cok faydali methoda sahiptir
        //ancak prim data turlerinin boyle bir ozelligi yoktur
        //prim data turleri sadece degerleri saklar (container)

        //prim data turleri icin de bazi methodlar gerekli oldugunda
        //java ara bir cozum uretmistir
        //java her bir primitive data turunu non-prim olarak kullanabilmek icin
        //ozel classlar olusturmustur ve buna wrapper class adini vermistir


        String str="Java";
        int sayi=10;

        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str);

        double sayi2=20.5;

        //sayi2 prim oldugundan sayi 2 dedigimizde hicbir method gelmez

        Double sayi3=15.2;

        // sayi3 wrapper class olan Double classini kullandigindan
        //sayi3 dedigimizde bircok method gelir




    }
}
