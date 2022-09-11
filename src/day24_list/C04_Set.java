package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Ali");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Can");
        System.out.println(isimler); //[Aykut, Ali, Yusuf, Ilker, Can]
        isimler.set(1,"Seckin"); //Ali gitti yerine seckin geldi
        System.out.println(isimler); //[Aykut, Seckin, Yusuf, Ilker, Can]

        //daha onceden listede var olanlari da arsiv gibi tutmak istersek
        List<String> logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos"));
        //Bu yontemle hem listedeki element degisti, hem de eski element
        //log listesine gonderildi.

        System.out.println(isimler);
        System.out.println(logListesi);


    }
}
