package day27_constructor;

public class Araba {
    int deneme;
    public Araba(){

    }

    String marka="X Marka";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    int yil;
    String yakit= yakitsorgu();
    String yesil=yesilSorgu();

    public Araba(String mdl, int yl, String ykt,int deneme) {
        model=mdl;
        yil=yl;
        yakit=ykt;
    }

    private String yesilSorgu() {
        String yesillik;
        if (yil>2020){
            yesillik="Yesil";
        }else {
            yesillik="Eski nesil";
        }
        return yesil;
    }

    private String yakitsorgu() {
        if (yil>2020){
            System.out.println("Yakit tipi benzin olamaz");
            yakit="Hybrid/dizel";
        }
        return yakit;
    }

    boolean otoPilot=otoPilotSorgusu();

    private boolean otoPilotSorgusu() {
        otoPilot=false;

        if (yil > 2020) {
            otoPilot=true;
        }else{
            otoPilot=false;
        }
        return otoPilot;
    }
    public String toString(){
        String arabaOzellikleri=marka+model+yil+yakit+yesil;
        return arabaOzellikleri;
    }
}
