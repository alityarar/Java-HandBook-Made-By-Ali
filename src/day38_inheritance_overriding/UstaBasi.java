package day38_inheritance_overriding;

public class UstaBasi extends Isci {
    public String statu="UstaBasi";
    public String haklar="Usta basi haftada bir gun ekstra tatilli";

    public void mesai(){
        System.out.println("Ariza varsa ustabasi ekxtra ucret almadan calisir");

    }

    public void maasHesapla(){
        System.out.println("Tum personel 30 gun* 8 saat * 10 euro = "+(30*8*10)+"maas  alir");
    }

    public static void main(String[] args) {
        /*
        Icinde oldugumuz classdan klasik haliyle bir obje
        olusturursak o obje ile cagirdigimiz variable ve
        methodlarda Java once icinde bulundugumuz class a bakar,
        eger varsa bize onu getirir.

        Yoksa, parent class lara bakar ve ilk buldugunu getirir.




         */
        UstaBasi yasin=new UstaBasi();
        System.out.println(yasin.statu); //Ustabasi
        System.out.println(yasin.haklar);

        /*
        Eger isci olarak ozelliklerini gormek istersek
        Class adini (Data Turu) isci seceriz
         */

        Isci ahmet=new UstaBasi();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye);//500 euro
        System.out.println(ahmet.izin); //bazen

        /*
        Ahmet in data turu Isci dir. Boylece biz ahmet i
        ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben ademin ustabasi oldugunu biliyorum
        cunku constructor i ustabasi
        Ama bu yazim formati ile Ahmet in tum Isci
        ile birlikte sahip oldugu ortak ozellikleri
        vurgulamak istiyorum

        Yani ahmet Ustabasidir, ancak biz ahmet in
        Isci ozelliklerini gormek icin bunu kullaniriz
         */


    }

}

