package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {


        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1998, 10, 8);
        System.out.println(Period.between(dogumGunu,bugun)); //P23Y7M5D

        System.out.println(Period.between(dogumGunu,bugun).getYears()); //23

    }
}
