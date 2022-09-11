package day17_ForLoop;

public class C07_ForLoop {
    public static void main(String[] args) {
        int sayi=60;
        for (int i = 60; i <=100 ; i++) {
            System.out.println(i);
            if (i%3==0){
                System.out.println(i +"Java");
            }else if(i%5==0){
                System.out.println(i +"Guzeldir");
            }else if (i%3==0&&i%5==0){
                System.out.println(i+ "Java guzeldir");
            }

        }
    }
}
