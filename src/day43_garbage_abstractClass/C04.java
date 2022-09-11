package day43_garbage_abstractClass;

public abstract class C04 {

    /*
    Bir abstract class da abstract veya concrete methodlar bulunabilir
    Child Classlarin abstract methodlari override etmesi mecburi iken
    concrete methodlarin override edilmesi opsiyoneldir
     */

    public abstract void absmethod();
    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        /*
        Abstract classlar constructora sahiptir ancak Abstract classlardan OBJE OLUSTURULAMAZ


        Abstract classlar OBJE BARINDIRMAYAN,
        sadece child classlar icin UYULMASI SART OLAN veya OPSIYONEL birakilan
        ozellikleri tanimladigimiz bir depo class gibidir
         */
    }
}
