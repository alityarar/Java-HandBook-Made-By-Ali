package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="java ile IT cok guzel";

        System.out.println(str.substring(5)); //5 inci indexten baslayarak
                                              // herseyi yazdiracak

        // yukaridaki Strin'i mehmet hoca ile IT cok guzel yapin

        System.out.println(str.replace("java","Mehmet hoca"));
        System.out.println("Mehmet hoca" +str.substring(5));

        // Eger bir index'den sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir
        //str.substring(baslangicIndexi, bitisIndexi)
        //baslangicIndexi==>Inclusive/dahil
        //bitisIndexi ==>Exclusive/haric

        System.out.println(str.substring(0,4)); //java
        System.out.println(str.substring(0,1)); //j

        System.out.println(str.substring(7,7));//hiclik verir

        //System.out.println(str.substring(5,2)); //Bitis indexi, baslangic
                                                // indexinden kucuk olamaz

        System.out.println(str.substring(str.length())); //son harften sonraki
                                                  // kismi, yani hiclik verir.




    }
}
