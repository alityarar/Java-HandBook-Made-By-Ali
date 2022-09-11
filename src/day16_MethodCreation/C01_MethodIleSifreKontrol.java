package day16_MethodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {

        //bir sifre olusturucaz
        //ilk harf buyuk olmali
        //son harf kucuk olmali
        //sifrede bosluk olmamali
        //en az 8 karakterli olmali

        String sifre="Adfjs2314c";

        boolean ilkHarfKontrol=ilkHarfKontrolEt(sifre);
        boolean soHarfKontrol=sonHarfKontrolEt(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean karakterKontrol=karakterKontrolEt(sifre);

        if (ilkHarfKontrol&&soHarfKontrol&&boslukKontrol&&karakterKontrol){
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisiz");
        }


    }

    private static boolean karakterKontrolEt(String sifre) {
        boolean karakterKontrolEtSonuc=true;
        if (sifre.length()>=8){
            karakterKontrolEtSonuc=true;
        }else{
            System.out.println("Karakter sayi hatasi");
        }
        return karakterKontrolEtSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=true;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else{
            System.out.println("Bosluk hatasi");
        }
        return boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf=sifre.charAt(sifre.length()-1);
        boolean sonHarfSonuc=true;
        if (sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z'){
            sonHarfSonuc=true;
        }else{
            System.out.println("Son harf hatasi" );
        }
        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkharf=sifre.charAt(0);
        boolean ilkHarfSonuc=true;
        if(sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z'){
            ilkHarfSonuc=true;
        }else{
            System.out.println("Ilk harf dogru degil");
        }

        return ilkHarfSonuc;

    }

}
