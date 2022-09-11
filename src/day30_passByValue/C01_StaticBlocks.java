package day30_passByValue;

public class C01_StaticBlocks {
    static { //Class calismaya baslamadan once yapmamiz gereken on atamalar
        //varsa, onlari yapmamiza olanak saglar
        //main methoddan once yada sonra olmasinin onemi yoktur, hep once calisir.

        System.out.println("static block calisti");

    }

    C01_StaticBlocks(){
        System.out.println("Const calisti");
    }


    public static void main(String[] args) {

        System.out.println("Main method baslangici");

    }

}
