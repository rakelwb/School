public class Fylki {

  public static void main(String[] args) {
    
    int[] a = new int[100];

      for (int i = 0; i < 100; i++) {
        a[i] = (int) (Math.random()*999);
      }

    int[] b = new int[50];

      for (int i = 0; i < 50; i++) {
        b[i] = a[2*i] + a[2*i+1];
      }
  }
}