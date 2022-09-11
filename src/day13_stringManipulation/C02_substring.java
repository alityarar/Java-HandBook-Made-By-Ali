package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        //1-48 of 104 results for "nutella"
        //bu arama sonucunda bulunan sonuc sayisini 100'den cok ise super
        //az ise "az sonuc bulundu" yazsin

        String str="1-48 of 104 results for \"nutella\"";

        //Ilk space indexi buluyoruz
        int ilkSpace=str.indexOf(" ");

        //Ikinci space indexi buluyoruz
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);

        //Ucuncu space indexi buluyoruz
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);

        //arama sonuc sayisini iki space icinde buluyoruz
        String aramaSonucSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);

        //arama sonuc sayisini String'den int'e ceviriyoruz
        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);

        //sayi bazinda sonucunu yazdiriyoruz
        if (aramaSonucSayisiInt>100){
            System.out.println("super");
        }


        //ben de burda int'e cevirmeden basamak sayisina gore sonucu yazdirdim
        if (aramaSonucSayisiStr.length()>2){
            System.out.println("super");
        }



       // String sonuc=str.substring(7,11);
        //if (String.sonuc>100){
           // System.out.println("super");
        //}
        //System.out.println(sonuc);
    }
}
