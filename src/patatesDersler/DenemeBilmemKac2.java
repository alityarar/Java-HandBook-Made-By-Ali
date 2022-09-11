package patatesDersler;

public class DenemeBilmemKac2 {
    public static void main(String[] args) {
        String str="Hello";

        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))) {
                System.out.print("*");
            }else{
                System.out.print(str.charAt(i));
            }

        }
    }
}
