package day11_stringManipulations;

public class Ozet {
    public static void main(String[] args) {
        //1- String Manipulation:== operataru String degerler icin saglikli
        //calismaz, cunku == hem degree hem de referansa bakar, dolayisiyla degeri
        //tamamen ayni olan iki String'i == ile karsilastirirsaniz cevap dogru olmayabilir
        //Emin olmak icin sadece degerleri karsilastiran equals() tercih edilmelidir

        //2-equalIgnoreCase(): String case sensitive (Buyuk-kucuk harf duyarlidir)
        //dolayisiyla karsilastirdigimiz kelime ayni kelime ama yazilisi farkli ise,
        //equal methodu false doner
        //(Money,money,MONEY).Eger buyuk-kucuk harf olmasi bizim icin onemli degilse,
        //equals yerine equalsignorecase tercih edilir.


        //3- length(): bize Strin'in karakter sayisini verir, ozel karakter
        //ve space de dahil).Index ile length() karsilastirilmamalidir.
        //Index 0'dan baslarken,length uzunluk ifade ettigi icin 1 den baslar.

        //son harfin indexini dinamik olarak bulmak icin  str.length()-1 kullanilir


        //4-indexOf (parameter veya parametreler) : istedigimiz bir char veya String'in
        //baska bir String icerisinde kacinci index'de oldugunu bize dondurur.

        //Eger aramaya bastan degil, belirledigimiz bir indexden baslamasini istiyorsak
        //o zaman iki parametre kullanilir
        //str.indexOf(arananStr,baslangic indexi). Baslangic indexi inclusive dir


    }
}
