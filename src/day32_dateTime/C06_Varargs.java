package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {
        //Verilen iki sayiyi toplayan bir method olusturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        //Bir de 3 sayi toplayan bir method olusturalim

        toplamaMethodu(sayi1,sayi2);
        toplamaMethodu(sayi1,sayi2,sayi3);
    }

    private static void toplamaMethodu(int sayi1, int sayi2) {
        System.out.println(sayi1+sayi2);
    }
    private static void toplamaMethodu(int... sayi) {
        int toplam=0;
        for (int each : sayi
             ) {
            toplam+=each;

        }
        System.out.println(toplam);
    }

}
