package interviewQuestions;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        //POZITIF ASAL SAYI TEST KODU

        Scanner scan= new Scanner(System.in);
        System.out.println("pozitif bir sayi girin");
        int sayi=scan.nextInt();
        if (sayi<1){
            System.out.println("pozitif sayi girin");
        }else{
            boolean asallik=true;
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    asallik=false;
                    break;
                }



            }
            System.out.println(asallik);
        }

    }
}
