package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Java, gun, gectikce, guzellesiyor]
        //Bosluklari daha okunur olmasi icin java kendisi koyuyor

        System.out.println(kelimeler[1]); //gun

        //Split kullandigimizda ve veri olarak bosluk girdigimizde, java
        //cumleyi kelimelere boluyor ve her kelime bir index oluyor
        //sonra icindeki indexe gore arattigimizda da istedigimiz indexteki
        //kelimeyi aliyoruz

        String gectikce[]=str.split("gectikce");
        //Gectikce kelimesini yok edip, onun yerine virgul yerlestirir ve yazdirir
        System.out.println(Arrays.toString(gectikce));

        String harfler[]=str.split(""); //hiclik
        System.out.println(Arrays.toString(harfler));
        //[J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]
        //Hiclik koyarsak, harflere ayirir cunku harfler arasinda hiclik vardir
        //bosluk ve virgul gibi seyleri de birer element olarak alir




    }
}
