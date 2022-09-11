package day39_overriding;

public class Corolla extends Toyota {
    String hiz="Corolla 200 kmh yapar";
    String yakit="Corolla benzinli veya elektriklidir";

    public void motor(){
        System.out.println("Corolla arabalar cevreci  motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 litre yakar");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 vitestir");
    }

    public static void main(String[] args) {
        Corolla arb1= new Corolla();
        System.out.println(arb1.hareket);  //araba
        System.out.println(arb1.hiz);//corolla
        System.out.println(arb1.yakit); //corolla
        System.out.println(arb1.marka); //Toyota
        System.out.println(arb1.mensei); //toyota

    }

}
