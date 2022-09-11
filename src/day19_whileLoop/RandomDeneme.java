package day19_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class RandomDeneme {
    public static void main(String[] args) {
        Random rnd= new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi girin");
        //int girilen=scan.nextInt();
        int tahmin=0;
        int sayac=0;
        while(sayi!=tahmin){
            System.out.println("Lutfen bir sayi giriniz");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("Kucult");
            }else if(tahmin<sayi){
                System.out.println("Buyut");
            }
            sayac++;

        }
        System.out.println("tuttugum sayiyi " + sayac+" tahminde buldunuz");
    }
}
