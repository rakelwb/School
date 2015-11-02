public class GamblerPlot
  {
    public static void main(String[] args) 
      { int N = Integer.parseInt(args[0]);
        while (N > 0)
          {
            for (int i = 0; i < N; i++) 
              System.out.print("*");
            System.out.println("");
            if (2.0*Math.random() > 1.0) N++; else N--;
          }
      }
  }