package day16_MethodCreation;

public class C03_Overloading {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayan bir method olusturalim
          int sayi1=10;
          int sayi2=20;

          ikiSayiTopla(sayi1,sayi2);

          //2 double toplamini yazdiran method

        double sayi3=15.2;
        double sayi4=12.3;
        ikiSayiTopla(sayi3,sayi4);

        int sayi5=14;
        double sayi6=15.6;
        ikiSayiTopla(sayi5,sayi6);




    } // Bir int bir double oldugunda eger tam olarak buna uygun bir method varsa onu kullanir
    private static void ikiSayiTopla(int sayi5, double sayi6) {
        System.out.println("Bir int bir double toplami : "+(sayi5+sayi6));
    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("Iki double toplami : "+(sayi3+sayi4));
    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println("Iki int toplami : "+(sayi1+sayi2));
    }
}
