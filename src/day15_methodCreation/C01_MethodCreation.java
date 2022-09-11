package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        String str="Java ogrenmek cok zevkli";

        //str'in ilk 4 harfini almak istersek
        str.substring(0,4);

        //bir program yaparken kodlarimizin daha kisa ve anlasilabilir olmasi icin
        //surekli kullanabilecegimiz kod bloklarini hazir olarak bir yere koyar
        //ihtiyacimiz oldukca oradan alip kullaniriz

        //methodlar, robotlara benzer
        //method olusturmak bazen o methodun yapacagi isi yapmaktan zor olabilir
        //bir islemi sadece 1 kere yapacaksak, method kullanmamiza gerek olmayabilir
        //ancak ozellikle cok kullanacagimiz islemler icin
        //her seferinde yeniden ayni kodlari yazmak yerine
        //bu islemi yapan hazir bir method olusturmak cok daha pratiktir.


        //Bazen bir class in icerisinde cok uzun kodlar yazarsak
        //tum class in anlasilmasi zorlasabilir
        //bunun yerine kodun belli kisimlarini ayri methodlar olarak olusturup
        //main method icerisinden istedigimiz sekilde bu methodlari yoneltebiliriz




    }
}
