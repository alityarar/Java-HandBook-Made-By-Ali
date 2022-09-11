package day03_scanner;

import java.util.Scanner;

public class Deneme_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scan variable in ismidir, degistirebiliriz


        //2. adim kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin

        System.out.println("Lufen isminizi giriniz");

        //3. adim kullanicin girdigi degeri uygun bir variable olusturup kaydedin

//        String kullanici= scan.next();
String kullanici=scan.nextLine();
       // System.out.println("Kllanicinin girdigi isim :" + kullanici);


    }
}
