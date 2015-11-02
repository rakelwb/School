public class HlutSlembiFylki { 

    public static double[] hlutSlembiFylki(int n) {
        int N = 2*n;
        double[] a = new double[N];

        for (int i = 2; i < N ; i = i+2 ) {
            a[i] = i/2;
        }

        for (int i = 1; i < N ; i = i+2 ) {
            a[i]= Math.random();
            
        }

        return a;
}
    public static void main(String[] args) { 
      
        double[] b = hlutSlembiFylki(6);

        for (int i = 0; i < 12 ; i++ ) {
            System.out.println(b[i]);
            
        }
    }
}
