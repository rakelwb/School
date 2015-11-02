public class Negative2 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(5+6 == 11 && 2+3 == 2);
        if (a<0 && b<0) System.out.println("Báðar neikvæðar");
        else if (a>0 && b>0) System.out.println("Hvorug neikvæð");
        else if (a<0 && b>0) System.out.println("Önnur neikvæð");
        else System.out.println("Önnur neikvæð");
    }
}