package day19_whileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int negatifToplam=0;
        int pozitifDeneme=0;

        do {
            System.out.println("Lutfen pozitif bir tam sayi girin ve bitirmek" +
                    "icin sifira basin");
            sayi=scan.nextInt();
            if (sayi<0) {
                System.out.println("negatif sayi giremezsiniz");
                negatifToplam++;
            }else if (sayi>0) {
                toplam += sayi;
                pozitifDeneme++;
            }
        }while(sayi !=0);
            System.out.println("girilen sayilarin toplami : "+toplam+" Negatif deneme sayisi : "+negatifToplam+" Pozitif deneme sayisi : "+pozitifDeneme);
        }

    }

