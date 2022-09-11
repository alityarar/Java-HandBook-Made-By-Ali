package day34_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj = new C01();
        C01.acikSayi=50;
        obj.acikString="bye";

        //Private access modifier oldugundan baska classdan erisilemez

        C01 objParametreli=new C01(5);
    }
}
