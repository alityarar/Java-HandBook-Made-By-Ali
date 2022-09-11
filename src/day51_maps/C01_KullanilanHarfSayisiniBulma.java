package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
        String input="Helloooo";
        String harflerArr[]=input.split("");

        Map<String ,Integer> kullanimSayilari=new HashMap<>();

       /* for (int i = 0; i <harflerArr.length ; i++) {
            if (kullanimSayilari.containsKey(harflerArr[i])){
                kullanimSayilari.put(harflerArr[i],kullanimSayilari.get(harflerArr[i])+1);
            }

        }*/

        for (String each:harflerArr
             ) {
            if (kullanimSayilari.containsKey(each)){
                kullanimSayilari.put(each,kullanimSayilari.get(each)+1);
            }else{
                kullanimSayilari.put(each,1);
            }

        }
        System.out.println(kullanimSayilari);



    }
}
