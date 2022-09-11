package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi = 20;
        //verilen sayinin 3 veya daha cok basamakli olup
        // olmadigini kontrol eden ve sonucu yazdiran bir ternary

        String sonuc =sayi>=100 ? "Sayi 3 basamakli veya daha buyuk" : "Sayi 3 basamaktan kucuk";



        //Ternary bize  sonuc dondurdugu icin ya bu sonucu direk yazdirmaliyiz
        //ya da sonucun data turune uygun bit variable a atama yapabiliriz

        System.out.println("Girdiginiz sayi analizi : " + sonuc);




    }
}
