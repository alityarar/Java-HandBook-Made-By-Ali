package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Good";
        int num1=5;
        int num2=3;

        //variablelarin degerlerini degistirmeden
        //assagidaki ifadeleri bu variable lari kullanarak yazdirin

        //Java5Good

        System.out.println(str1+num1+str2); //Java5Good

        //2Good15
        System.out.println(num1-num2+str2+str2+num1*num2); //2Good15

        //Java22

        System.out.println(str1+(num1-num2)+(num1-num2));  //Java22

        //53Good

        System.out.println((num1*num1*2)+num2+str2);
        System.out.println(""+ num1+num2+str2);

        /*
        Eger tamamen sayilardan olusan bir String varsa ve biz
        bunu int'a cevirmek istersek,
        Integer.valueof(str)

        Bir sayiyi String'e cevirmek istersek
        ""+sayi
         */
    }
}
