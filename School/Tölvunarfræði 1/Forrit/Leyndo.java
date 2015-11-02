public class Leyndo  {

public static int leyndo(int a, int b) {
if (b == 0)
return 1;
if (b%2 == 0) return leyndo(a*a, b/2);
return leyndo(a*a, b/2) * a;
}
	public static void main (String[] args) {
		System.out.println(leyndo(4,6));
	
	}
}

