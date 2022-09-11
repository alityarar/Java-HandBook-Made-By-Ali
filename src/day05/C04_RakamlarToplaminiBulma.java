package day05;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan aldiginiz 4 basamakli bir sayinin basamaklar toplamini bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        //1.Adim r=0 rt=0 sayi=7532

        rakam=sayi%10;  //2
        rakamlarToplami +=rakam; //2
        sayi/=10; //753

        //2.Adim r=2 rt=2 sayi 753

        rakam=sayi%10; //3
        rakamlarToplami +=rakam; //5
        sayi/=10;  //

        //3.Adim r=3 rt=5 sayi=75

        rakam=sayi%10; //5
        rakamlarToplami +=rakam; //10
        sayi /=10; //7

        rakam=sayi%10; //7
        rakamlarToplami +=rakam; //17
        sayi/=10; //0





    }
}
