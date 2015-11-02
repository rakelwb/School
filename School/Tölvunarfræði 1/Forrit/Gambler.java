public class Gambler { 

    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);   

            
        for (int i = 0; i < stake; i++) 
            
            System.out.print("*");
            System.out.println("");
            
            if (2.0*Math.random() > 1.0)  stake++; 

            else stake--;    
    }    
}


