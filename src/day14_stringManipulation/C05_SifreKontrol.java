package day14_stringManipulation;

public class C05_SifreKontrol {
    public static void main(String[] args) {
        String sifre="Aaaaaaaabb";

        boolean ilkHarf= false;

        if(sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z'){
            ilkHarf=true;
        }else{
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");
        }

        boolean sonharf= false;

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonharf=true;
        }else{
            System.out.println("Sifrenizin son harfi kucuk olmali");
        }


        if(sifre.length()-1>=8&&(sifre.charAt(0)>='A')&&(sifre.charAt(0)<='Z')){
            System.out.println("yes");
        }
        boolean bosluk=false;

        if (!sifre.contains(" ")){
            bosluk=true;
        }else{
            System.out.println("sifre bosluk icermemeli");
        }

        boolean uzunluk=false;

        if (sifre.length()>=8){
            uzunluk=true;
        }else{
            System.out.println("uzunluk en az 8 karakter olmali");
        }

        if (uzunluk&&bosluk&&ilkHarf&&sonharf==true){
            System.out.println("hepsi uyumlu");
        }
    }
}
