package day18_nestedForLoop;

import java.util.Scanner;

public class Deneme_3 {
    public static void main(String[] args) {
        //sifre sorma yapicaz
        //dogru yapana kadar deniycek
        //belki 3 yanlisda kitlenecek

        Scanner scan=new Scanner(System.in);
        System.out.println("Sifreyi giriniz");
        int sifre= scan.nextInt();
        int kilit=1;

        while(kilit<2){
            System.out.println("Tekrar deneyin");
            sifre= scan.nextInt();
            if (sifre==12345){
                System.out.println("Basarili");
                kilit++;

            }

        }
    }
}
