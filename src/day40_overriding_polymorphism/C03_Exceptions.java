package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int kontrol=0;
        while (kontrol !=2){
            System.out.println("Bolmek istediginiz sayiyi girin");
            int sayi1=scan.nextInt();

            System.out.println("Kaca bolmek istediginizi yazin");
           int sayi2=scan.nextInt();
            try {
                System.out.println("sonuc = "+sayi1/sayi2);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("devam etmek icin 1 \nbitirmek icin 2 ye basin");
            kontrol=scan.nextInt();


        }

        /*System.out.println("Bolmek istediginiz sayiyi girin");
        double sayi1=scan.nextDouble();

        System.out.println("Kaca bolmek istediginizi yazin");
        double sayi2=scan.nextDouble();

        System.out.println("sonuc = "+sayi1/sayi2);
        */



    }
}
