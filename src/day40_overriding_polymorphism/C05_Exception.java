package day40_overriding_polymorphism;

import java.util.Scanner;

public class C05_Exception {
    /*
    Kullanicidan istedigi kadar sayiyi alip toplayan bir program yazin. Toplam
    500 u gecerse programi bitirsin veya Kullanici
    bitirmek istediginde q ya basmalidir.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam=0;

        do {
            System.out.println("sayilari girin\nbitirmek icin q ya basin");
            int sayi = 0;


            try {
                sayi = scan.nextInt();
            } catch (Exception e) {
                if (sayi == 'q') {
                    System.out.println(toplam);
                } else {
                    break;
                }  
            }


            toplam += sayi;
            }while (toplam < 500) ;
            System.out.println(toplam);



    }
}
