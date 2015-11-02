public class Div7 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean a1 = a % 7 == 0;
        boolean b1 = b % 7 == 0;
        if (a1 && b1) System.out.println("true");
        else System.out.println("false");

    }
}