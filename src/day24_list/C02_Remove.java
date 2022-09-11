package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Ali");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Can");

        isimler.remove("Can");
        //remove(istenObject) methodu istenen elementi kaldirip
        //bize true/false doner.
        //eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        //methodu boolean bir variable a atayabilirsiniz
        boolean sonuc=isimler.remove("Ali"); //true
        if (sonuc==true){
            System.out.println("Istediginiz isim silindi");
        }else{
            System.out.println("Istediginiz isim listede olmadigindan silinemedi");
        }
        System.out.println(isimler);
        //Istediginiz isim silindi
        //[Aykut, Yusuf, Ilker]


        //remove(index) yazdigimizda sildi/silmedi ihtimali kalmaz
        //bize remove edilen elementi doner
        System.out.println(isimler.remove(1)); //Yusuf u siler ve
                                                    //delil olarak yusuf ismini
                                                    // bize dondurur

        System.out.println(isimler); //[Aykut, Ilker]

        //yazdirsak da yazdirmasak da liste degisti ve 1.indexdeki element silindi


    }
}
