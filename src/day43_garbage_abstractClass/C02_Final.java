package day43_garbage_abstractClass;

public class C02_Final extends C01_Final {
    public static void main(String[] args) {
        System.out.println(C01_Final.finallik);
        //Ulasilabilir ama degistirilemez
    }

    /*
    Override, parent classdaki methodu child class a uyarlamak demekti yani islevini
    degistirmek istiyoruz ancak parent classdaki method final olarak tanimlandigindan
    Java methodun uyarlanmasina izin vermiyor
     */


   // public static final void method1(){
     //   System.out.println("Parent class final method1");
}
