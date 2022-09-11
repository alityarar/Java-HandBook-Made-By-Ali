package day05;

public class C07_WrapperClass {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";

        //verilen iki stringdeki sayilari toplayin

        System.out.println(str1+str2); //yan yana yazdirir

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        //Ustteki olayla wrapper class ile cevrilebilir

        // System.out.println(Integer.valueOf(str1) methodu sadece
        //sayisal deger iceren stringlerde kullanilabilir
        //bir tane bile sayi disinda karakter olursa java hata verir.




    }
}
