package day45_interface;

public interface I01_Default_Static {
    /*
    Interface lerde sadece abstract methodlar bulunur.
    Body si olan concrete bir method olusturmak istedigimizde Java CTE verir

    Ancak Java8 ve uzeri versiyonlarda istisnai olarak static veya defaul
    tanimlanan methodlarin bodysi olabilir.Ancak burada kullanilan default
    keywordu access modifier degildir. Cunki interfacelerde tum methodlar
    public ve abstract ti

    Assagidaki ornekte gorulecegi gibi default olarak tanimlanmis bir
    methoda access modifier olarak public yazabilirsiniz
    (Access modifier yazmasak da Java, methodu public olarak kabul edecektir)

     */

    void method1();

    public default void method2(){
        System.out.println("interface deki default method");
    }
    static void method3(){
        System.out.println("interfacedeki static method");
    }

}
