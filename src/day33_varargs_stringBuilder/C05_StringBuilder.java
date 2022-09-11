package day33_varargs_stringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {
        //Compare iki sb in ilk harften baslayarak tum karakterleri karsilastirir
        //ayni olan karakterler icin bir sey yazdirmaz
        //farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya
        //ileride oldugunu yazdirir



        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("ali can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));  //-32

        //Tamamen ayni ise bize 0 dondurur
        //Bir sb ile String i compare etmek istersek java CTE verir

    }
}
