package day12_stringManipulation;

public class C08_SwitchCaseDefault {
    public static void main(String[] args) {

        //Burdaki mesele,switch ile yazilan degere es bir deger aranir
        //case yazdiktan sonra olabilecek esitlikle ilgili secenekler yazilir
        //kod, break gordugu an durur, yoksa devam eder
        //default un kullanim alani else gibidir, son care

        // SWITCH float-boolean-double-long KABUL ETMEZ
        // PROGRAM CALISMAZ

        //BREAK GORENE KADAR CALISMAYA VE YAZDIRMAYA DEVAM EDER

        int maas = 7000;

        switch (maas){

            case 2000:
                System.out.println("Asgari ucret");
                break;
            case 4000:
                System.out.println("Ogretmen maasi");
                break;
            case 7000:
                System.out.println("Tester maasi");
                break;
            default:
                System.out.println("Yok boyle bir maas");
        }
    }
}
