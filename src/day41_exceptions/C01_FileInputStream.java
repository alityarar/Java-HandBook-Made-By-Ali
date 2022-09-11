package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        /*

        Bir kod yazarken olasi exceptionlar ongorulup exception olusturdugunda
        java nin ne yapmasini istedigimiz belirtilmelidir.

        1- eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
         method isminin yanina olusabilecek exception i deklare edebiliriz

         2- Eger exception olussa da kodun calismaya devam etmesini istiyorsak kodu
         try catch blogunun icine alir ve try bloguna sorun cikarabilecek kodu yazarken
         catch kismina da olusabilecek hatayi ve eger hatayi alirsa ne yapmasi
         gerektigini yazabiliriz
         */

        String dosyaYolu="src/day41_exceptions/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
