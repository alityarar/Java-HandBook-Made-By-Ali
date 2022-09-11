package day12_stringManipulation;

public class C07_replace {
    public static void main(String[] args) {

        // replace(); verilen stringdeki istenen karakter ve karaterleri
        // yeni karakterler ile degistirir

        String str="Java ogrenmek cok kolay";

        System.out.println(str.replace("a", "x"));
        System.out.println(str.replace("java","x"));
        System.out.println(str.replace("a","xxx"));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace('a','x'));

        String str1="Bugun ne cok sey ogrendik";
        //bu cumledekei bosluk disindaki karakter sayisini bulunuz

        System.out.println("space haric karakter sayisi : " + str1.replace("","."));

        //atama yapilmadigi surece orjinal string kalici olarak degismez
        //sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal str karakter sayisi : " +str1.length());

        //str1 de kalici degisiklik yaapalim
        //bugun yerine yarin yazsin
        //ogrendik yerine ogrenecegiz yazsin

        str1=str1.replace("Bugun","yarin");
        str1=str1.replace("ogrendik","ogrenecegiz");
        System.out.println("Kalici degisiklikten sonra : " +str1);

        str1.replace("ne cok", "ne az"); //calismaz
        //atama yoksa, kalici degisiklik de yok
        //str1=str1 diye baslamali

    }
}
