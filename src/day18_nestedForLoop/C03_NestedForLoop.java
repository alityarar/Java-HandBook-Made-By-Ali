package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****  seklinde loop yapma

         */

        int input=6;

        for (int i = 1; i <=input ; i++) {
            for (int j =1; j <=i ; j++) {

                //NestedForLoop ya dikdortgen veya ucgen formatinda olabilir
                //Dikdortgen istedigimizde iki loop icin de bagimsiz end point belirleriz
                //ucgen sekli vermek icin, innerloop un end pointi olarak outer i belirleriz

                System.out.print(i*j+" ");

            }

            System.out.println("");


        }
    }
}
