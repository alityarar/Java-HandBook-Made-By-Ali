package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araclar max 240kmh");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel araclar max 250 kmh");
        }
    }
    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla renk secenekleri kirmizi ve beyaz");
        }else if (model.equals("Yaris")){
            System.out.println("Yaris icin siyah ve beyaz");
        }
    }


}
