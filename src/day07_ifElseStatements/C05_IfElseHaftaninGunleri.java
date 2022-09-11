package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi girin");
        String gunIsmi= scan.next().toUpperCase(Locale.ROOT);

        if (gunIsmi.equals("Pazar") || gunIsmi.equals("Cumartesi")){
            System.out.println();
        }
    }
}
