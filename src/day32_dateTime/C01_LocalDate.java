package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh= LocalDate.now();
        //objenin olusturdugu  tarihi trh ye atar

        LocalDate baskaTrh= LocalDate.of(1998,10,8);
        //istedigimiz yil ay ve gun degerlerine gore bize obje olusturur


        //get methodu ayrintili bilgi almamiza olanak saglar
        System.out.println(trh.getDayOfMonth()); //10
        System.out.println(trh.getDayOfWeek()); //TUESDAY
        System.out.println(trh.getMonthValue()); //5
        System.out.println(trh.getYear()); //2022
        //mesela objenin olusturuldugu tarihi not almak istersek bunu yapabiliriz

        System.out.println(trh.minusWeeks(20)); //2021-12-21
        System.out.println(trh.minusWeeks(5).minusDays(3)); //2022-04-02
        //5 hafta 3 gun onceki tarihi sorduk

        System.out.println(trh.plusDays(10)); //2022-05-21

        System.out.println(LocalDate.now().isLeapYear()); //false
        //Is ile baslayan methodlar boolean sonuclar dondurur


        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); //2022-05-11





    }


}
