package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //Ternary ile yapilan tum islemler if else ile de yapilabilir
        //If else yerine ternary tercih etme sebebi yapinin basit ve
        //anlasilabilir olmasidir.Ternary icerisinde kompleks kodlar olmaz
        //Sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        //Kullanicidanbir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen positif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift");
        } else {
            System.out.println("Tek  Sayi");
        }

        System.out.println(sayi%2==0 ? "sayi cift" : "Sayi tek");

        //bastaki kisim boulean sart
        //ilk print sonuc 1 yani true
        //ikinci print sonuc 2 yani false


    }
}
