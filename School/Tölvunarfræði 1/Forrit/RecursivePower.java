public class RecursivePower  {

	public static int exp(int base, int n) {
		if(n == 0) return 1;
		
		else return base * exp(base, n-1);
	}
	
	public static void main (String[] args) {
		int base = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		System.out.println(exp(base, n));
	}
}

