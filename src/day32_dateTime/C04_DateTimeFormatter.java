package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat); //2022-05-13T13:22:31.754510300

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/M/YYYY");

        System.out.println(formatter.format(tarihSaat)); //13/5/2022

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("HH : mm");
        System.out.println(formatterSaat.format(tarihSaat)); //13 : 34

        /*
        FORMAT OLUSTURURKEN

        GUN

        d;  basta 0 varsa onu yazmadan gun numarasi
        dd;  tek haneli gunler 01 gibi basinda sifirla yazdirilir
        DDD;  yilin kacinci gunu oldugunu yazar
        E,EE,EEE; gun isminin ilk 3 harfi
        EEEE;  gun isminin tamamini yazdirir

        AY
     M; basta 0 varsa onu yazmadan ay numarasi
     MM; tek haneli aylaari 01 gibi basina sifir yazarak ay numarasi
     MMM; ay isminin  ilk 3 harfi
     MMMM; ay isminin tamami

     YIL

     YY; yilin son iki rakamini yazdirir
     YYYY; Yilin tamamini yazdirir

     Saat; (24 saat uzerinden istiyosak H, 12 saat uzerinden istiyorsak h)

     HH;  saatin tamami, tek rakamli saat olursa 02 gibi
     H;  tek rakamli saat olursa sadece saati

     hh;  12 saat dilimine gore 2 takam olarak
     h;  12 saat dilimine gore tek rakam olanlari tek olarak yazar


     m;   minute
     mm;   ikili halde


     a yazarsak AM veya PM degerlerini yazar






         */






    }
}
