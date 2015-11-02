public class Pizza  {
	
	public static void main (String[] args) {

		double tommur = Double.parseDouble(args[0]);
		double sm = tommur * 2.54;
		double rad = sm / 2;
		double flat = Math.PI * rad * rad;
		int nemi = (int) flat / 500;

		if (nemi == 1) {
			System.out.println("Þessi pizza nægir fyrir " + nemi + " nema");
		}
		else 

		System.out.println("Þessi pizza nægir fyrir " + nemi + " nemendur");

	}
}

