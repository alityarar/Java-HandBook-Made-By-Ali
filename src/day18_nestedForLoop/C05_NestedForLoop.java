package day18_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {


        char karakter='J';

        for (char i ='A'; i <=karakter ; i++) {
            for (char j = 'A'; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");

        }
        for (char i ='A'; i <='J' ; i++) {
            for (char j = 'A'; j <= 'J'-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");

        }



    }
}
