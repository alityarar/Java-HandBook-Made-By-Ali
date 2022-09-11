package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //kullanicidan bir kelime isteyin
        //eger kelime 3 harften kisa ise "kelime cok kisa"yazdirin
        //eger kelime 3-4-5 harfli ise harf sayisini ve
        //kelimenin tersen yazilisini yazdirin
        //eger 5 haften uzunsa, kelime cok uzun yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        String tersKelime="";


        if (kelime.length()<3){
            System.out.println("kelime cok kisa");
        } else if (kelime.length()>5){
            System.out.println("kelime cok uzun");
        } else if (kelime==kelime){
            if (kelime.length()==3){

                tersKelime=kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);


            }else if (kelime.length()==4){

                tersKelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

            }else{
                tersKelime=kelime.substring(5)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

            }
            System.out.println("Harf sayisi : "+ (kelime.length())+"\ntersten yazimi: "+tersKelime);
        }





    }
}
