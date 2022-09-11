package day20_scope_Arrays;

public class C02_Scope_StaticVariables {

    /* instance variablelar obje ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable in son degerini bulmak icin sadece o objeyi
    dikkate aliriz.

    static variable =ler ise class variable olarak tanimlanir ve tum class
    uyeleri icin aynidir. Okul ismi,muduru adi gibi eger static variable in
    degeri degistirilirse, herkes icin degistirilir
     */

    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;



    public static void main(String[] args) {

        System.out.println(okulIsmi);



        staticMethod();    //  yazarak methodu cagirmazsak method calismaz

    }


    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);

    }
}
