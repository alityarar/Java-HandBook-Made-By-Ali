package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {

        /*
        Bir variablei encapsule etmek icin
        1-Access modifier i private yapariz

        2-Okuma ve yazma ozelliklerinin kullanilmasini
        istedigimiz gibi sinirlayabiliriz

        -Eger okunmasini istiyorsaniz getter
        -Sadece girilebilsin isterseniz setter
        methodlarini olustururuz

        Bir variable icin hem getter hem setter
        olusturursaniz o variable public olmus gibi hem
        okuyup hem de yazilmasini saglayabiliriz

         */
        C03 obj = new C03();

        obj.getSayi();
        System.out.println(obj.getSayi());  //0

        obj.setStr("Java java java");

        System.out.println(obj.getStr());

        System.out.println(obj);



    }
}
