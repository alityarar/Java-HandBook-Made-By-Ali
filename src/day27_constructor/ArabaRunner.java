package day27_constructor;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1= new Araba();
        System.out.println(arb1.marka);
        System.out.println(arb1.tekerAdedi);
        System.out.println(arb1.motoruVarMi);
        arb1.model="Z model";
        arb1.yil=2011;
        arb1.yakit="Dizel";
        //her obje olusturdgumuzda model yakit vs tek tek atamak istemezsek

       // Araba arb2=new Araba("Y Model",2021,"Benzin");
        Araba arb3=new Araba("Y Model",2021,"Benzin",24);
        System.out.print(arb3.model+arb3.deneme);

       // System.out.println(arb1.toString());
       // System.out.println(arb2.toString());



    }


}
