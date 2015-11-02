public class MySierpinski  {

	public static void drawTri(double[] x, double[] y) {
		StdDraw.filledPolygon(x,y); }

	public static void draw(int n,double x0, double x1, double x2, double y0, double y1, double y2 ) {
			if (n==0) return;	

		double [] x = new double[3];
		double [] y = new double[3];
		x[0] = (x0+x1)/2.0;
		x[1] = (x1+x2)/2.0;
		x[2] = (x2+x0)/2.0;
		y[0] = (y0+y1)/2.0;
		y[1] = (y1+y2)/2.0;
		y[2] = (y2+y0)/2.0;

      	StdDraw.setPenColor(StdDraw.WHITE);
      	drawTri(x,y);
      
      	draw(n-1, x[0], x[1], x1, y[0], y[1], y1);
		draw(n-1, x[1], x[2], x2, y[1], y[2], y2);
		draw(n-1, x[2], x[0], x0, y[2], y[0], y0);
	}
	
	public static void main (String[] args) {
		int N =Integer.parseInt(args[0]);

		double[] x = {0.0, 0.5, 1.0};
		double[] y = {0.0, 0.866, 0.0};

		double x0 = 0.0, y0 = 0.0;
		double x1 = 0.5, y1 = 0.866;
		double x2 = 1.0, y2 = 0.0;

      	StdDraw.setPenColor(StdDraw.BLACK);
      	drawTri(x,y);
      	draw(N, x0, x1, x2, y0, y1, y2);
	}
}

