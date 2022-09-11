package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap=MapOlustur.mymap();


        System.out.println(sinifListMap);
        /*
        myMap...entrySet();   methodu bize Entry lerden olusan
        bir set dondurur.Eger bu Entryleri manipule etmek istiyorsak
        methodun dondurdugu Set i yeni bir Set olusturup store etmeliyiz

         */
      Set<Map.Entry<Integer,String>> sinifEntrySeti= sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each : sinifEntrySeti
             ) {
            System.out.println(each);

            String entryStr=each.toString();
        }
    }
}
