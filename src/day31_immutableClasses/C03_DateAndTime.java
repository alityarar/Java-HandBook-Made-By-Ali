package day31_immutableClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_DateAndTime {
    public static void main(String[] args) {

    }

    //tarih ve zaman icin 3 class vardir. Bunlardan kendimize uygun olani secip
    //olusturabiliriz

    //1- Local Date
    LocalDate currentDate1 = LocalDate.now();

    //2-Local time
    LocalTime currentTime1=LocalTime.now();

    //3-Local Date time
    LocalDateTime currentTime=LocalDateTime.now();

}
