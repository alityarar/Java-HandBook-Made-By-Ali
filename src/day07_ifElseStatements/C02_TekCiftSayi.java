package day07_ifElseStatements;

import java.util.Scanner;

public interface C02_TekCiftSayi {
    public static void main(String[] args) {

        //soru1- kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("girilen sayi cifttir");
        }

    }
}
