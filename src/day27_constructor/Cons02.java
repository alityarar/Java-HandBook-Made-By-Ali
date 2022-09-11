package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 = new Cons01(); //Default const devrede
        // Cons01 class inda hic constructor olusturmazsak
        // java default const i kullandigindan
        //obj uretebiliriz

        //Ancak biz parametreli veya parametresiz bir const yazdigimizda
        //Java default const i siler

        //Dolayisiyla biz herhangi bir const olusturdugumuzda
        //daha once baska claslar veya kullanicilarin
        //olusturmus olabilecegi objeleri kullanabilmeleri icin
        //default const in islevini gerceklestirmesi icin
        // bir tane de parametresiz obje olusturmaliyiz


        Cons01 obj2=new Cons01("Java");


    }
}
