package day14_stringManipulation;

import java.util.Locale;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

        String input="kara";

        System.out.println(""+input.charAt(3)+(input.charAt(2))+""+(input.charAt(1)+""+(input.charAt(0))));

        String tersStr=input.substring(3).toUpperCase(Locale.ROOT)+
                       input.substring(2,3).toLowerCase(Locale.ROOT)+
                       input.substring(1,2).toLowerCase(Locale.ROOT)+
                       input.substring(0,1).toLowerCase(Locale.ROOT);

        System.out.println(tersStr);



    }
}
