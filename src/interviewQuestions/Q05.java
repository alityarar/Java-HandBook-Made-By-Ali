package interviewQuestions;

import java.util.Scanner;

public class Q05 {

    // STRING KOD KONTROL KODU

    public static void main(String[] args) {
        String sifre = "abcd";
        Scanner scan=new Scanner(System.in);
        System.out.println("sifre girin");


        int denemeSayisi=0;

        for (int i = denemeSayisi; i <3 ; i++) {
            String giris=scan.nextLine();
            if (!giris.equals(sifre)){
                System.out.println("sifre yanlis "+(2-i)+" hakkiniz kaldi");
                denemeSayisi++;
                if ( (i==2)) {
                    System.out.println("deneme hakkiniz bitti");
                    break;
                }



            }else{
                System.out.println("sifre basarili");
                break;
            }

        }
    }
}
