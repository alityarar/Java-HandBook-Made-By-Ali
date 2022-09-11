package day11_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";

        System.out.println(str1.indexOf('J')); // 0
        System.out.println(str1.indexOf("aska")); //10 (Baslangic indexini verir)
        System.out.println(str1.indexOf('l'));// 19 35
        System.out.println(str1.length()-1); //19

        //Ayni harften birden fazla varsa, ilk buldugu eslesmenin indexini dondurur


        //verilen stringdeki 2.a harfinin indexini bulalim

        int ilkindex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a', ilkindex+1)); //3

        //+1 demek 1 karakter sonrasindan itibaren ara demek

        //20.indexden sonra guzel aratalim

        System.out.println(str1.indexOf("guzel" , 20)); //31

        // stringde olmayan bir harf aratalim

        System.out.println(str1.indexOf("y")); //-1

        //indexof methodu sadece int ile donus yapar, o yuzden "Yok" demek
        // icin  -1 verir



        // OZET: indexof method'u icierise yazilan String veya...


        // 1)char'in indexi sorgulanabilir
        // 2)parametre String olabilir
        //Olmayan karakter sorgulanabilir
        //Parametre kelime olabilir
        //Belli bir indexten sonra arama baslatilabilir



    }
}
