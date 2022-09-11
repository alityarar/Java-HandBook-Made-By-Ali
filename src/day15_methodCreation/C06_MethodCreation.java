package day15_methodCreation;

import java.util.Scanner;

public class C06_MethodCreation {
    public static void main(String[] args) {

        //onceki class ile ayni seyi yapicaz ama method yaparak ayarlayacagız

        //kullanicidan bir kelime isteyin
        //eger kelime 3 harften kisa ise "kelime cok kisa"yazdirin
        //eger kelime 3-4-5 harfli ise harf sayisini ve
        //kelimenin tersen yazilisini yazdirin
        //eger 5 haften uzunsa, kelime cok uzun yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String kelime=scan.next();
        int harfSayisi=kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisa");

        } else if(harfSayisi==3){
            ucHarfiTersineCevir(kelime);


        }else if(harfSayisi==4){
            dortHarfiTersineCevir(kelime);



        }else if(harfSayisi==5){
            besHarfiTersineCevir(kelime);


        }else{
            System.out.println("kelime cok uzun");
        }


    }

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(5)+
                kelime.substring(4,5)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelime sayisi 5");
        System.out.println("tersten yazilisi : "+tersKelime);
    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelime sayisi 4");
        System.out.println("tersten yazilisi : "+tersKelime);
    }

    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelime sayisi 3");
        System.out.println("tersten yazilisi : "+tersKelime);
    }
}
