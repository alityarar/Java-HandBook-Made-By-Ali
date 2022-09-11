package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void AbstractMethod();

    /*
    Abstract methodlar
    child classlarin MUTLAKA override etmesi gereken methodlardir
    dolayisiyla HICBIR ZAMAN direk calistirilamazlar
    ve bu sebeple method bodysine ihtiyac yoktur

    Abstract olmayan classlara Concrete class/method denir
    Concrete kati demektir

    Abstract methodlar body e sahip olamaz
    Concrete methodlar ise method body si olmadan olusturulamaz.
     */
}
