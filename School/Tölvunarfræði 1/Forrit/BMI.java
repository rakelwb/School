public class BMI {

	public static void main (String[] args) {

		double tyngd = Double.parseDouble(args[0]);
		double haed = Double.parseDouble(args[1]);
		System.out.println("BMI stuðull er " + tyngd/(haed*haed));
	}	
     
}

