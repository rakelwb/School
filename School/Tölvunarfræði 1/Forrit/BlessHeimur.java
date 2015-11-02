public class Negative2 { 
    public static void main(String[] args) {  
        int N = args.length; 
        String[] b = new String[N]; 
            for (int i = 0; i < N-1; i++) { 
                b[i] = args[i+1];                
            } 
        b[N-1] = args[0]; 
        for (int i = 0; i < N; i++) { 
            System.out.println(args[i]); 
        } 
        System.out.println("******");  
        for (int i = 0; i < N; i++) { 
             System.out.println(b[i]); 
        }       
    } 
}
