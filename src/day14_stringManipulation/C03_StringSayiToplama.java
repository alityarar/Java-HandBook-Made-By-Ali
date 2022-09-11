package day14_stringManipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {

        String str1="13.99";
        String str2="10.55";

        double str3=Double.parseDouble(str1);
        double str4=Double.parseDouble(str2);
        double total=str3+str4;

        String total1=String.valueOf(total);
        total1=total1.replace(".",",");
        System.out.println(total1+"$");


        //Ilk degerlerimiz string oldugu icin direk toplayamayiz
        //once double degeri acip Double.parseDouble ile degeri double a ceviriyoruz
        //daha sonra nokta yerine virgul koymak icin double degerini String degeri acip
        //String e ceviriyoruz. Bu sayede replace methodunu kullanabiliyoruz






    }
}
