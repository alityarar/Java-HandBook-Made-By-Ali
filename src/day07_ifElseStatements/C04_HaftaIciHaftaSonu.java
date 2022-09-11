package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //soru 3- kullanicidan gun ismi alin ve hafta ici veya hafta sonu
        //oldugunu yazdirin
        //ornek:   gun=pazar    output="hafta sonu"
        // *** string icin equals method unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi veya sali veya... ise ===>hafta ici

        //String case sensitive dir
        //bu durumda String methodlarindan yardim aliriz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase(Locale.ROOT); //Kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("Girdiginiz gun haftasonu");
        }
        else System.out.println("Hafta ici");



    }
}
