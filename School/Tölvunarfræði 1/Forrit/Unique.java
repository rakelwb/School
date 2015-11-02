public class Unique{

  public static void main(String[] args) {
   args = new String[]{"4","3","2","1"};
    int[] a = new int[args.length]; //stærð á fylki háð args

    for (int i = 0; i < args.length; i++) {
      a[i] = Integer.parseInt(args[i]);
    } 
    //selection sort
    for (int i = 0; i < args.length; i++) { 
      int min = i;
      for(int j = i + 1; j < args.length; j++) {
        if(a[j] < a[min]) min = j;  
      }
      int temp = a[min];
      a[min] = a[i];
      a[i] = temp;
    }
    //hve mörg ólík stök
    int stak = a[0];
    int telja = 1;

    for (int i = 1; i < args.length; i++) {
      if(a[i] != stak) {
        telja++;
      }
      stak = a[i];
    }
    //fjöldi staks
    int m = 0;
    int integerToBeCounted = a[0];
    int[] fjöldi = new int[telja];
    for (int i = 0; i < args.length; i++) {
      if(integerToBeCounted == a[i]) fjöldi[m]++;
      else {
        m++;
        integerToBeCounted = a[i];
        fjöldi[m] = 1;
      }
    }
   //gildi staks
    int[] gildi = new int[telja]; 
    int k = 0;
    int n = 0;
    
    while(n < fjöldi.length) {
      gildi[n] = a[k];
      k = k + fjöldi[n];
      n++;
    }

    for (int i = 0; i < fjöldi.length;i++ ) {
      if(fjöldi[i] != 1) {
        System.out.println(fjöldi[i] + " eintök af " + gildi[i]);
      }
    }

   int s = 0;
    for (int i = 0; i < fjöldi.length; i++) {
      if (fjöldi[i] == 1) s++;      
    }

    if (s == fjöldi.length) System.out.println("Allar mismunandi");

  }
}

