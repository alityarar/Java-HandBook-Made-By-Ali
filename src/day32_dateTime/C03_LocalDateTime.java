package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat); //2022-05-13T13:18:12.726777500
                                        //Aradaki T time ile farkini gostermek icin

        System.out.println(tarihSaat.plusYears(3).plusDays(5).plusMinutes(34));
        //2025-05-18T13:53:42.868148
    }
}
