package day18_nestedForLoop;

public class Deneme {
    public static void main(String[] args) {
        String isaret="*";
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(isaret);

            }
            System.out.println("");
        }
        for (int i = 1; i <=8-1 ; i++) {
            for (int j = 1; j <=8-i ; j++) {
                System.out.print(isaret);

            }
            System.out.println("");
        }
    }
}
