public class SlembiTeikna { 

    public static int slembi739(int r) {

      int t = ((171*r)+7) % 739;

      return t;  
    }

    public static void main(String[] args) { 

    	int[] a = new int[1000];
    	int r = 0;

    	for (int i = 0; i < a.length; i++) {
    		a[i] = slembi739(r);
    		r = a[i];
    	}

    	double[] b = new double[a.length];
    	for (int i = 0; i < a.length ; i++ ) {
    		b[i]=a[i]/738.0;
    		System.out.println(b[i]); 		
    	}
		
		for (int i = 0; i < a.length; i++) {
			StdDraw.point(b[i/2],b[(i/2)+1]);
		}          
    }
}
