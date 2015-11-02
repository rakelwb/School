public class Median  {
	
	public static void main (String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double min, med, max;
		med = a;

		if(b == c) med = b;
		if(a < b && b < c) med = b;
		if(a < c && c < b) med = c;
		if(a > b && b > c) med = b;
		if(a > c && c > b) med = c;

		System.out.println(med + " er miðgildi");
	}
}