public class palin {

	public static boolean palin(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if(a[i] == a[N-i-1]) return true; 
			else return false; 			
		}
		
	}
   
    public static void main(String[] args) {
    	int[] a = {1,2,3,2,1};
        System.out.println(palin(a));
    }
}

