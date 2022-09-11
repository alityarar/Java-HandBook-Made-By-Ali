package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String email="abc@gmail.com";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)){
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
