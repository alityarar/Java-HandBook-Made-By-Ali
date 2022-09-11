package day18_nestedForLoop;

import java.util.Scanner;

public class Deneme_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //System.out.println("Sayi adedi girin");
        int sayiAdedi=5;
        int sayi=0;
        int toplam=0;

        /*for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Sayiyi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(sayiAdedi+" "+toplam );
         */
        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiAdedi){
            System.out.println("Sayi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(toplam);

    }
}
