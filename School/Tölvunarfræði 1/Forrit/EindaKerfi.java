public class EindaKerfi  {
	
	public static void main (String[] args) {

		double fjarlægð = Double.parseDouble(args[0]);
		double massi1 = Double.parseDouble(args[1]);
		double massi2 = Double.parseDouble(args[2]);

		double miðja = fjarlægð*(massi2/(massi1+massi2));

		System.out.println(miðja);
	}
}

