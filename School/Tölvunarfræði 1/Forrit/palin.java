public class palin {

	public static boolean palin(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if(a[i] != a[N-1-i]) return false; 
		}

		return true; 	
		
	}
   
    public static void main(String[] args) {
    	int[] a = {5,8,9,6,6,9,8,5};
        System.out.println(palin(a));
    }
}

