package day11_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C05_Length {
    public static void main(String[] args) {

        //Kullanicidan isim alip bas harfini ve son harfini buyuk harfle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk harf : " + isim.toUpperCase(Locale.ROOT).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.ROOT).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length()); //0

        String str2=null;
        //System.out.println(str2.length()); //calistirildiginda hata verir
        //null = yok/hic


    }
}
