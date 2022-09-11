package day49_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        /*
        Java collections uyesi bir yapida data turu object secilirse
        her data turunden ekleme yapabiliriz ancak bu durumda surekli
        casting problemleri ile karsilasabiliriz.
         */
        List<Object> list = new ArrayList<>();
        list.add("Engin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);

        Map<Integer,String[]> sinifList = new HashMap<>();

        /*
        Bir sinifta ogrenci no ve isim,soyisim,brans olarak map
        olusturmak istiyoruz.

        Key tek bir unique degerdir.

        Ama value/deger birden fazla bilginin birlesiminden olusabilir.
        Bu durumda daha sonra istedigimiz bilgilere dogru sekilde
        ulasabilmek icin
        tum elementler icin value ayni bicimde olusturulmalidir.
        (Veri siralamasi ve sekilsel acidan, bosluklar dahil)
         */
        String[] class101 = {"Ali","Can","Dev"};

        sinifList.put(101,class101);
        //System.out.println(sinifList.get(101).Arrayt);
        System.out.println(sinifList.keySet()+Arrays.toString(class101));
        System.out.println();
        //sinifList.put(102,"Veli,Yan,QA");
        //sinifList.put(103,"Ali,Yan,QA");

        System.out.println(sinifList);
        //{101=Ali,Can,Dev, 102=Veli,Yan,QA, 103=Ali,Yan,QA}
        System.out.println(sinifList.keySet());
        //[101, 102, 103]
        System.out.println(sinifList.values());
        //[Ali,Can,Dev, Veli,Yan,QA, Ali,Yan,QA]






    }
}
