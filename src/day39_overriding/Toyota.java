package day39_overriding;

public class Toyota extends Araba {

    String hiz="Toyota 220 hiz yapar";
    String marka="Toyota";
    String mensei="Japonya";


    public void motor(){
        System.out.println("Toyota marka motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("Toyota Arabalar motor gucune vs gore yakit tuketirler");
    }
    public void garanti(){
        System.out.println("Toyota araclar 10 yil garantilidir");
    }

}
