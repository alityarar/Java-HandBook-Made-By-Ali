package day15_methodCreation;

public class C07 {
    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(5)+
                kelime.substring(4,5)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelime sayisi 5");
        System.out.println("tersten yazilisi : "+tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelime sayisi 4");
        System.out.println("tersten yazilisi : "+tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelime sayisi 3");
        System.out.println("tersten yazilisi : " + tersKelime);
    }
}
