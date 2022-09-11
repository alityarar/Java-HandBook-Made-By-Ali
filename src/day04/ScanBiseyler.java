package day04;

import java.util.Scanner;

public class ScanBiseyler {
    public static void main(String[] args) {

        //Kullanicidan bir isim alip sadece ilk harfini yazdirmak

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz ");
        char ilkHarf = scan.next().charAt(0);

        //charat(index) method u parametre olarak yazdigimiz indexdeki char i bize getirir
        //Stringde index 0 dan baslar

        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);

    }
}
