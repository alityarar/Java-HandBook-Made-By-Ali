package day03_scanner;

import java.util.Scanner;

public class Deneme_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      //ADIM 1

        System.out.println("Saatlik ucretinizi giriniz");

        double saatlik= scan.nextDouble();

        System.out.println("Gunluk saatinizi yaziniz");

        double gunluk= scan.nextDouble();

        System.out.println("Gunluk kazanciniz :" + gunluk*saatlik);

      //  System.out.println("Gunluk ucretiniz : " + saatlik*8);
        // System.out.println("Haftalik Ucretiniz : " + saatlik*8*5);
    }
}
