public class ReverseString {
    /*
    Bir cumleyi tersten yazdirma icin sunlari kullanin

    1-stringbuilder
    2-string classini kullanarak
    3-bir method olusturun, ardindan methodu main methoddan cagirin
     */
    public static void main(String[] args) {

        //1-StringBuilder() kullanarak

        String input = "All is well";

        StringBuilder str= new StringBuilder();
        str.append(input);

        String reverseInput= str.reverse().toString();
        System.out.println("1.yol ; "+reverseInput);


        //String class kullanilarak
        System.out.print("2.yol ; ");

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }
        System.out.println();

        //Bir method olusturun ve ardindan methodu main methoddan cagirin

        System.out.print("3.yol ; ");

        tersArray(input);







    }

    private static void tersArray(String input) {
        char [] arr=input.toCharArray(); //String bir veriyi karakterlere char tipinde ayirir

        for (int i = input.length()-1 ; i >=0 ; i--) {
            System.out.print(arr[i]);

        }
    }
}
