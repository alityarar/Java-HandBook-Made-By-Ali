package day19_whileLoop;

public class C05_Scope {

    //bir method icerisinde olusturulan variable lar sadece olusturulduklari
    //methodda kullanilabilirler, baska methodlarda kullanilamazlar
    //2- Tum methodlarin kullanabilmesini istedigimiz variable lari
    //Class level'da olustururuz.
    //Class level'da olusturdugumuz variable'i static yaparsak tum methodlar kullanabilir
    //static olmazsa (instance) o zaman sadece static olmayan methodlar kullanabilir.
    
    public static void main(String[] args) {

        int sayi=10;


    }
    public static void method1(){

    }
    public void method2() {

    }
}
