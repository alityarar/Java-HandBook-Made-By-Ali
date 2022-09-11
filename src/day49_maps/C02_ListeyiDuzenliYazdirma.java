package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {

        Map<Integer, String> sinif = MapOlustur.mymap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("============================");

        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();


    }
}
