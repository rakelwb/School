public class SlembiBil {

	public static void main (String[] args) {

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double ran = Math.random()*(b-a)+a;

		System.out.println(ran);
	}	
     
}