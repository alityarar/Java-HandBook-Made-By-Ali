package day39_overriding;

public class Araba {
    String hareket="arabalar teker ile hareket eder";
    String hiz="Arabalar motor gucune gore hizlidir";
    String yakit="Farkli yakit turu olabilir";
    String marka="Uretildikleri markaya sahipler";

    public void motor(){
        System.out.println("arabalar farkli markalarda motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("Arrabalar motor gucune vs gore yakit tuketirler");
    }



}
