package day15_methodCreation;

public class C10_MethodCreation {
    public static void main(String[] args) {

        String str="ali";

        //Stringi yazdiran method olusturalim
        stringYazdir(str);

        //hosgeldiniz diyen bir method olusturun
        hosgeldinYazdir();

        kapanisMesaji();
    }

    private static void kapanisMesaji() {
        System.out.println("Bizi tercih ettiginiz icin eyvallah");
    }

    private static void hosgeldinYazdir() {
        System.out.println("Hos geldin");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
    }
}
