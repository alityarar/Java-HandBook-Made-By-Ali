public class day11 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        try {
            a+=b;
            System.out.println(a+=b);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(a+=b);
        }


    }
}
