package day15_methodCreation;

import java.util.Locale;

public class C11_MethodCreation {
    public static void main(String[] args) {
        
        String isim="dsafds";
        String soyisim="dsfdg";
        String kartno="2342354352436";
        


        String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim);
        String gizlenmisKrediKarti=krediKartiGizle(kartno);

        System.out.println(gizlenmisIsimSoyisim);
        System.out.println(gizlenmisKrediKarti);


        String yeniIsim= isim.substring(0,1).toUpperCase(Locale.ROOT)+
                isim.substring(1).replaceAll("\\w","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase(Locale.ROOT)+
                soyisim.substring(1).replaceAll("\\w","*");
        String yeniKart= kartno.substring(0,1)+kartno.substring(1).replaceAll("\\d","*");


    }

    private static String krediKartiGizle(String kartno) {

        String yeniKart= kartno.substring(0,1)+kartno.substring(1).replaceAll("\\d","*");
        return yeniKart;
    }

    private static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim= isim.substring(0,1).toUpperCase(Locale.ROOT)+
                isim.substring(1).replaceAll("\\w","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase(Locale.ROOT)+
                soyisim.substring(1).replaceAll("\\w","*");


        //method olusturmada 3.adim
        //method calisinca sadece bir sey mi yazdiracak
        //yoksa bize bir data mi dondurecek buna karar vermektir
        //bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        //return type i void degil String sectik
        //ve methodun sonuna return edilecek datayi yazdik
        return yeniIsim+" "+yeniSoyisim;


    }
}
