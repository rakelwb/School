public class GeometricMean { 

    public static double geomean(double[] a) {
       
       double n = a.length;
       double margfeldi = a[0];
       for (int i = 1; i < n; i++) {
            margfeldi = margfeldi*a[i];
       }
      
       double svar = Math.pow(margfeldi,1/n);
       return svar;
    }

    public static void main(String[] args) { 
        double[] k = {1,2.5,3.1,4};
        double c = geomean(k);
        System.out.println(c);
      
        
            
        
    }
}
