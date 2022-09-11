package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamakli bir sayi giriniz");

        } else if (sayi%5==0){//5 ile bolumunden kalan 0 ise

            if (sayi%10==0){
                System.out.println("5 e bolunebilen cift sayi");
            } else {  // 4 basamakli, 5 e bolunebilen
                System.out.println("tekrar deneyin");

            }
        } else { // 4 basamakli ve 5 e bolunemiyor
            System.out.println("Tekrar deneyin");


            //if (4 basamakli degilse){
            //}else if (5 e bolunuyorsa){
            //}else{
            //}
        }
    }
}
