package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        //kullanicidan bir cimle ve kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak;
        //  -Girilen kelime cumlede kullanilmis
        //  -Girilen kelime cumlede 1 kere kullanilmis
        //  -Girilen kelime cumlede 1'den fazla kullanilmis

        String cumle= "Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime= "yeni";

        int ilkKullanim=cumle.indexOf(kelime);
        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (ikinciKullanim==(-1)){
            System.out.println("Istenen kelime cumlede 1 kere kullanilmis");
        } else{
            System.out.println("Girilen kelime cumlede 1 den fazla kullanilmis");
        }
    }
}
