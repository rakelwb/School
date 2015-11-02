public class InverseE  {
	
	public static void main (String[] args) {

		double n = 1;
		double inverseE = 0;
		double realInverse = 1/Math.E;
		double difference = Math.abs(realInverse - inverseE);
		
		while (difference > 0.0001) {
				
				inverseE = Math.pow(1-(1/n), n);
				difference = Math.abs(realInverse-inverseE);		
				n++;
		}

		System.out.println("Nálgaða gildið er " + inverseE);
		System.out.println("Rétta gildið er " + realInverse);
		System.out.println("Gildið af n sem skilar þessari nálgun er " + n);

	}
}
