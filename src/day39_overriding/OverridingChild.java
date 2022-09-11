package day39_overriding;

public class OverridingChild extends OverridingParent{
    public static void method1(){
        System.out.println("Child class method 1");
    }

    public static void main(String[] args) {

        method1();
    }
}
