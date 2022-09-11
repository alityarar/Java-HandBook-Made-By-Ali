package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {

        //Kullanicidan mail adresini girmesini isteyin
        //@gmail.ile bitmiyorsa "lutfen mail adresi girin" yazin
        //... bitiyorsa "mailiniz kaydedildi" yazin
        //bitmiyorsa "lutfen yazimi kontrol edin"yazin

        String email="abc@gmail.com";
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){  //unlem isareti boolean in tersini gosterir

            //email, aranan metni iceriyormu? (unlemden dolayi sonuc tersi verir)

            System.out.println("lutfen gmail adresi yazin");


        } else if (email.lastIndexOf(arananMetin)==(email.length()-10)){



            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
