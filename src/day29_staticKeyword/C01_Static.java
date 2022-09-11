package day29_staticKeyword;

public class C01_Static {
    String okulIsmi="Yildiz koleji";
    static String okulTelefonu="546498416";

    public static void staticMethod(){
        System.out.println("Static method calisti");
    }
    public void voidstaticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
    }
}
