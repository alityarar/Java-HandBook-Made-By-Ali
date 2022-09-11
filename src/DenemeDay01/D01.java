package DenemeDay01;

import java.util.Locale;
import java.util.Scanner;

public class D01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gun ismi girin");
        String gunAdi = scan.next().toUpperCase(Locale.ROOT);

        if (gunAdi.equals("PAZAR")) {
            System.out.println(gunAdi.charAt(0)+""+gunAdi.charAt(1)+""+gunAdi.charAt(2));
        } else {
            System.out.println("Tekrar girin");
        }
    }

}

// //Kullanicidan bir isim alip sadece ilk harfini yazdirmak
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Lutfen bir isim giriniz ");
//        char ilkHarf = scan.next().charAt(0);
//
//        //charat(index) method u parametre olarak yazdigimiz indexdeki char i bize getirir
//        //Stringde index 0 dan baslar
//
//        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);