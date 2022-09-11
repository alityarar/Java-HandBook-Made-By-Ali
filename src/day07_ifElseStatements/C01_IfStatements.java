package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {
        int a=2;
        int b=3;

        if (a==b){
            System.out.println("Verilen Sayilar Esit");

        }

        if (a>100){
            System.out.println("Bundan Buyuk");
        }

        if (a*b>5){
            System.out.println("Sayilari carpimi 5 den buyuk");

        }

        if (a>b) System.out.println("ozel parantez olmadigi icin sadece 1 satir calisir");
        
    }
}
