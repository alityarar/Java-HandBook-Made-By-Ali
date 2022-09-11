package day36_inheritance;

public class SurekliIsciler extends Isci{

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "\nisciStatu='" + isciStatu + '\'' +
                ", \nsaatUcreti=" + saatUcreti +
                ", \nstatu='" + statu + '\'' +
                ", \nmaas=" + maas +
                ", \npersNo=" + persNo +
                ", \nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nadres='" + adres + '\'' +
                ", \ntel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SurekliIsciler surIc1=new SurekliIsciler();
        surIc1.persNo=123;
        surIc1.isim="Cem";
        surIc1.soyisim="Sem";
        surIc1.saatUcreti=11;
        surIc1.maas=surIc1.maasHesapla();
        System.out.println(surIc1);

    }

}
