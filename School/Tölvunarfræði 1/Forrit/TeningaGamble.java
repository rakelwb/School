public class TeningaGamble { 


    public static int diceToss() {
        int dice1 = (int) (Math.random()*6+1);
        int dice2 = (int) (Math.random()*6+1);
        int sum = dice1 + dice2;
        return sum;   
    }

    public static boolean firstToss() {
        int sum = diceToss();
        if (sum == 7 || sum == 11) return true;
        else if (sum == 2 || sum == 3 || sum == 12) return false; 
        else return nextToss();
    }

    public static boolean nextToss() {
        int sum = diceToss();
        if (sum == 7) return false;
        else if (sum == 2 || sum == 3 || sum == 11 || sum == 12) return nextToss();
        else return true;
    }

        public static void main(String[] args) { 

            int T = Integer.parseInt(args[0]);
            int wins = 0;

           for (int i = 0; i < T; i++) {
                firstToss();
                if (firstToss() == true) wins++;
           }

           System.out.println("Number of wins: " + wins);
    
    }
}