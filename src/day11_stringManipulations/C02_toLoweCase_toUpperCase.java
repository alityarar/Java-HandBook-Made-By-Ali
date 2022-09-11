package day11_stringManipulations;

import java.util.Locale;

public class C02_toLoweCase_toUpperCase {

    public static void main(String[] args) {

        String str="Java Guzeldir";

        //Biz string methodlarini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

       // str.charAt(5) ; boyle yazdigimizda sonuc artik string degil char olacaktir
        //dolayisiyla stringde yapmak istedigimiz tum degisiklikleri
        //once yapip sonra charAt methodunu kullanmaliyiz


        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));  //JAVA GUZELDİR





    }
}
