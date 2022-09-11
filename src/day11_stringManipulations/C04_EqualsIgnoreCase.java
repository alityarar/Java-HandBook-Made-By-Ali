package day11_stringManipulations;

import java.util.Scanner;

public class C04_EqualsIgnoreCase {

    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istemedigini sorun
        //evet derse, cevabini ve "derse katiliminiz alinmistir" yazdirin
        //hayir derse, cevabini ve "sonraki derslerimize bekleriz" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz? \n Evet veya Hayir yaziniz");

        // \n alt satira gecir demek

        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katiliminiz onaylanmistir");

        } else if (cevap.equalsIgnoreCase("hayir")){

            System.out.println("cevabiniz : " + cevap + "sonraki derslerimize bekleriz");



        } else {
            System.out.println("Lutfen evet veya hayir yaziniz");
        }


    }

    //Verilen iki String degiskeni buyuk harf/kucuk harf farki gozetmeksizin
    //karsilastirir

    //Buyuk/kucuk harf farkliligi disinda herhangi bir karakter farkliligi
    //oldugunda equals...

    //      7) length()
    //  verilen Stringdeki karakter sayisini dondurur.




}
