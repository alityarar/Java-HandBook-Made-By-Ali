package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu="src/day41_exceptions/dosya.txt";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read()) !=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        ALti kirmizi cizili her kod CTR degildir

        Java syntax hatalarini derleme esnasinda (compule) farkeder ve altini cizer. Biz
        bu gune kadar tamamina CTE diyorduk ancak exception konusu ile
        Compile Time Exception kavrami da hayatimiza girdi
         */

    }
}
