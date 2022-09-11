package day31_immutableClasses;

public class C02_Equals {
    public static void main(String[] args) {

        String a="";
        a+=2;
        a+="c";
        a+=false;

        if (a=="2cfalse"){
            System.out.println("==");
        }
        if (a.equals("2cfalse")){
            System.out.println("equals");
        }

        //Cevap equals dir cunku islem gordukten sonra elementler == olmaz
        //ama degerleri gorunurde ayni oldugu icin, equals methodu ile
        //denetlendiginde birbirine equal gorunurler

        String b="2cfalse";   //==
        if (b=="2cfalse") {
            System.out.println("==");
        }


    }
}
