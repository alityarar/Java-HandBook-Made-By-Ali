package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        //parametre olarak bir int ve istedigimiz kadar String alan
        //en uzun kelimenin harf sayisi ile
        //in parametre degerini carpip sonucu yazdiran bir method olusturun

        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";

        //Eger bir methodda, varargstan once net bir parametre varsa, o varargstan
        //once yazilir, varargs en son yazilir cunku varargs acik ucludur ve
        //her geleni kabul eder.
        //Bu sebeple bir methodda birden fazla varargs olamaz

        //VARARGS LAR BIR TUR ARRAYDIR

        carpim(sayi,str1,str2,str3);



    }

    private static void carpim(int sayi, String... str) {
            String enUzunStr="";
        for (String each:str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println("istenen deger ; " +sayi*enUzunStr.length());
    }
}
