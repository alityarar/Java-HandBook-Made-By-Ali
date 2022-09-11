package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        //kullanicidan isim-soyisim alip
        //butun harfleri * yapalim

        String str="Java'da rakamlar 12345";

        //Assagidaki harfler kisaltmadir ve bunlara Regex denir
        // Regex kisaltmasi CAPSLOCK acik yazilirsa, opposite anlami alir

        System.out.println(str.replaceAll("a","*"));  //Butun a lari yildiz yapar
        System.out.println(str.replaceAll("\\s","*")); //Butun bosluklari yildiz yapar
        System.out.println(str.replaceAll("\\S","*")); //Bosluk olmayan herseyu yildiz yapar
        System.out.println(str.replaceAll("\\w","*")); //Butun rakam ve harfleri yildiz yapar (') haric cunku o harf yada sayi degildir
        System.out.println(str.replaceAll("\\W","*")); //Butun rakam ve harf hariclerini yildiz yapar
        System.out.println(str.replaceAll("\\d","*")); //Butun rakamlari yildiz yapar
        System.out.println(str.replaceAll("\\D","*")); //Butun rakam hariclerini yildiz yapar




    }
}
