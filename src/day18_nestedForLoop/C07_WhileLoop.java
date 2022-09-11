package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {


        //kullanicidan kac sayi toplamak istedigini alin
        //ve bu sayilari alip sayilarin toplamini ekrana yazdirin

        int sayiAdedi = 5;

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println("Lutfen sayi girin");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("girilen "+ sayiAdedi+" sayinin toplami "+toplam);

    }

}
