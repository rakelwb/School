public class Hradi  {
	
	public static void main (String[] args) {

	double þyngd = Double.parseDouble(args[0]);
	double verð;

	if (þyngd > 25) {

		System.out.println("Pakki er of þungur");
	}
	
	if (þyngd <= 25 && þyngd > 0) {

		verð = 2500+500*(Math.ceil(þyngd)-1);
		System.out.println("Sendingakostnaður er " + verð + " kr.");
	}
	
	if (þyngd <= 0) {

		System.out.println("Ólögleg þyngd");
	}
	}
}
