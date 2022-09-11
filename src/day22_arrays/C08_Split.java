package day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        //Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        //bir method olusturun

        String cumle="Nerde o hello world yazdiramayan ogernciler?";
        String harf="o";




        harfkackerekullanildi(cumle,harf);

    }

    public static void harfkackerekullanildi(String cumle, String harf) {
        int sayac=0;
        String harfler[]=cumle.split("");



        for (int i = 0; i <harfler.length ; i++) {
            if (harfler[i].equals(harf)){
                //equals methodu tüm elementler ve indexleri
                //aynı ise, true dondurur. Aksi takdirde false dondurur
                sayac++;
            }

        }
        System.out.print(sayac);

    }
}
