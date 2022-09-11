package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {

    //BAS HARF VE SON HARFI , GIRILEN SAYI KADAR YAZDIRMA KODU

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir kelime girin");
        String str=scan.nextLine();
        System.out.println("Bir sayi girin");
        int sayi=scan.nextInt();

        String karakter1 =str.substring(0,1);
        String karakter2= str.substring(str.length() - 1);
        //System.out.println(karakter1+karakter2);
        System.out.print("girilen harfler ; ");

        for (int i = 0; i <=sayi ; i++) {
            System.out.print(karakter1+karakter2);

        }

    }
}
