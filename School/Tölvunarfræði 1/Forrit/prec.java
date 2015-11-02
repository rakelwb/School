public class Prec {

	public static boolean prec(int[] a, int i, int j) {
		
		if(a[i] != a[j]) return false; 
		else
		return prec(a,i+1, j-1);	
		
	}
   
    public static void main(String[] args) {
    	int i = 0;
    	int j = a.length-1;
    	int[] a = {5,8,9,6,6,9,8,5};

    	prec(a, i, j);


    }
}

