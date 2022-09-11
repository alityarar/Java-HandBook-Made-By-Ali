package day03_scanner;

import java.util.Scanner;

public class YillikKazancDenemesi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen saatlik ucretinizi giriniz");
        double saatlik= scan.nextDouble();
        System.out.println("Gunluk Calisma Saatinizi Girin");
        double gunluk= scan.nextDouble();
        System.out.println("Haftada kac gun calistiginizi yazin");
        double haftalik=scan.nextDouble();
        System.out.println("Yilda kac gun izin yaptiginizi girin");
        double yillikIzin=scan.nextDouble();
        System.out.println("Vergi ve Sigortanin Kestigi Yuzdeyi Girin");
        double kesinti=scan.nextDouble();

        System.out.println("Bu hesaplamalar kesintinin %" + kesinti + " oldugu varsayilarak hesaplanmistir " );
        System.out.println("Gunluk kazanciniz : " + ((((saatlik/100)*(100-kesinti))) * gunluk));
        System.out.println("Haftalik Kazanciniz : " + ((((saatlik/100)*(100-kesinti))) * gunluk * haftalik));
        System.out.println("Aylik Kazanciniz : " + ((((saatlik/100)*(100-kesinti))) * 4 * gunluk * haftalik));
        System.out.println("Yillik Kazanciniz : " + ((((saatlik/100)*(100-kesinti) * 4 * gunluk * haftalik*12))-(yillikIzin*(((saatlik/100)*(100-kesinti))) * gunluk)));
        System.out.println("Yillik Odediginiz Tax ve Sigorta Gideri :"+ (((saatlik*gunluk*haftalik*52)-(yillikIzin*(saatlik*gunluk)))-((((saatlik/100)*(100-kesinti) * 4 * gunluk * haftalik*12))-(yillikIzin*(((saatlik/100)*(100-kesinti))) * gunluk))));
    }
}
