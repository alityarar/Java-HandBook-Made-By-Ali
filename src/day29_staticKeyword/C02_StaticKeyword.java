package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        //Baska classdaki static class uyelerine ulasabilmek icin
        //sadece classIsmi.staticUyeIsmi yazmamiz yeterlidir.

        System.out.println(C01_Static.okulTelefonu);
        C01_Static.okulTelefonu="151546484"; //Bu degisiklik calisma durana kadar kalicidir.
        System.out.println(C01_Static.okulTelefonu);

        //Baska classdaki static olmayan class uyelerine ancak o classdan
        //obje olusturarak ulasabiliriz. Ve obje ile yapilan atamalar sadece
        //o obje icin gecerlidir


        C01_Static obj1= new C01_Static();
        System.out.println(obj1.okulIsmi);

    }
}
