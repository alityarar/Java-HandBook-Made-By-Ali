package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        int input=5;
        int faktoryel=1;
        for (int i = input; i>=1; i--) {
            faktoryel*=i;

            int fakt=1;
            for (int j = input; j>=1 ; j--) {

                System.out.println((input)+j+"! = "+faktoryel);
            }

           // System.out.println((input)+j+"! = "+faktoryel);
        }
        //System.out.println((input)+"! = "+faktoryel);
    }
}
