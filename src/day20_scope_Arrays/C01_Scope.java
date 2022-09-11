package day20_scope_Arrays;

public class C01_Scope {

    //Instance (object) Variable

    int sayi;
    String bransIsmi="Java";
    boolean okulAcikmi;

    public static void main(String[] args) {

        //sayi=10; sayi variable'i static olmadigi icin methoddan direk kullanilamaz
        //instance variable lara static methodlardan ulasabilmek icin obje olusturmamiz
        //gerekir

        C01_Scope obj1= new C01_Scope(); //Scope obje olusturduk
        System.out.println(obj1.sayi); //0 verir
        obj1.sayi=10; //sayiya 10 degerini atadik
        System.out.println(obj1.sayi);  //10 verir

        C01_Scope obj2=new C01_Scope(); //yeni bir obje olusturduk
        System.out.println(obj2.sayi); //obje yeni oldugu icin tekrar 0 verir





    }
}
