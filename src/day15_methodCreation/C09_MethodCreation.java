package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //iki variable in degerlerini toplayan bir method olusturalim
        //1.adim: method adini yazalim
        //2.adim: methoda gondermem gereken arguman var mi?

        ikiSayiTopla(a,b);
        ikiSayiTopla(25,50);
    }

    //Bir methodu olusturmak calismasi icin yeterli degildir
    //method ancak cagirilirsa calisir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : "+(a+b));
    }
}
