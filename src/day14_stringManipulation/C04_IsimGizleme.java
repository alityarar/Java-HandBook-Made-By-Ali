package day14_stringManipulation;

import java.util.Locale;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        String isim="Abcfd";
        String soyisim="Dfkljgdf";
        String kartno="154654646";


        String yeniIsim= isim.substring(0,1).toUpperCase(Locale.ROOT)+
                         isim.substring(1).replaceAll("\\w","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase(Locale.ROOT)+
                            soyisim.substring(1).replaceAll("\\w","*");
        String yeniKart= kartno.substring(0,1)+kartno.substring(1).replaceAll("\\d","*");


        //System.out.println(yeniIsim);
        //System.out.println(yeniSoyisim);
        //System.out.println(yeniKart);
    }
}
