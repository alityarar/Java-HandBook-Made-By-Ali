package day11_stringManipulations;

import java.util.Locale;

public class C03_Equals {
    public static void main(String[] args) {

        // ONEMLI KONU- STRINGLER ICI KARSILASTIRMA


        String str1="Ali Can";
        String str2="Ali " + "Can";

        System.out.println("Str1 : " + str1);
        System.out.println("Str2 : " +str2);

        System.out.println("== ile karsilastir " + (str1==str2));
        System.out.println("equals ile karsilastir " + str1.equals(str2));


        String str3=str1+"";

        System.out.println("Str3 : " + str3);

        System.out.println("== ile karsilastir " + (str3==str2));
        System.out.println("equals ile karsilastir " + str3.equals(str2));


        // String'de == her zaman dogru sonuc vermez
        //bunun icin, emin oldugumuz equals methodunu kullanmayi tercih ederiz

        String str5="hasan";
        String str6="HASAN";

        System.out.println(str5.equals(str6)); //false cunku string case onemser

        System.out.println(str5.toUpperCase(Locale.ROOT).equals(str6));  //true








    }
}
