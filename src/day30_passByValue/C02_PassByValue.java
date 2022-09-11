package day30_passByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main methodda etiket fiyati ; "+etiketFiyati);

    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        //etiketFiyati sadece method adidir, ustteki gercek degeri degistirmez
        //sadece value sini getirir ve kullanir. Bu pass by value olayidir
        //Bir primitive variable i arugment olarak bir methoda yollarsak
        //java o variable i degil, value sini methoda aktarir

        etiketFiyati=etiketFiyati*0.9;
        System.out.println("yuzde 10 indirimli fiyat ; "+etiketFiyati);
    }
}
