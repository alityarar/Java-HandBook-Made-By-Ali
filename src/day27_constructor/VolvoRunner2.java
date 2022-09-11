package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        //her obje olusturdugumuzda model, yakit gibi degerleri tek tek atama
        //yapmak istemiyorsak

        Volvo arb1=new Volvo("JC60",false,2023,"Benzin");
        System.out.println(arb1.toString());
    }
}
