package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm= LocalTime.now();
        System.out.println(tm); //00:17:23.599519900

        //islemler arasi zaman farkini hesaplama

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }

        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1) + " nanosaniyede bitti");

        //ileri veya geri gidebiliriz

        System.out.println(tm.plusMinutes(1000));

        //istersek ZoneId kullanarak istedigimiz bolgenin saati icin de
        //obje olusturabiliriz





    }
}
