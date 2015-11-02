public class DæmiBók  {
	
	public static void main (String[] args) { 

		int n = 1000000;
		double sum = 0.0;

		for (int i = 1; i <= n; i++) {

			sum += 1 / (i*i);
			
		}

		System.out.println(sum);

	}
}


	/*a)	for (int i = 1; i <= n; i++) {

			sum += 1 / (i*i);
			

		b	for (int i = 1; i <= n; i++) {

			sum += 1.0 / i*i;
			
		}



		c for (int i = 1; i <= n; i++) {

			sum += 1.0 / (i*i);
			
		}
 */
