package day36_inheritance;

public class Memur extends Muhasebe{

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


        Memur memur1=new Memur();

        /*
        Memur objesi Memur classinin objesi
        olmasina ragmen inherit ettigi Muhasebe
        ve onun da parent i olan Personel
        classlarindaki tum datalari alabilir
         */

        //PERSONEL CLASSINDAN
        memur1.persNo=1001;
        memur1.isim="ahmet";
        memur1.soyisim="yilmaz";
        memur1.adres="ankara";
        memur1.tel="324353525";

        //MUHASEBE CLASSINDAN
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="memur";

        //GENERATE/TO STRING DERSEK
        //TO STRING METHODU OLUSTURUR VE
        // MEMUR1 IN BUTUN OZELLIKLERINI GORURUZ

        Memur memur2=new Memur();
        memur2.persNo=3435;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);



    }


}
