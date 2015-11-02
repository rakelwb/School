public class Sudoku {
    public static void main(String[] args) {
        // Fylki sem er lögleg lausn á Sudoku þraut
        int[][] s = {
            { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
            { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
            { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
            { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
            { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
            { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
            { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
            { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
            { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };

        // Fylki sem er mjög líklega ekki lögleg lausn á Sudoku þraut
        int[][] t = new int[9][9];
        for (int i=0; i<9; i++)
            for (int j=0; j<9; j++)
                t[i][j] = (int)(Math.random()*9)+1;
    
        // Kóði til að staðfesta að s sé lögleg og athuga hvort t sé lögleg
    	

    	for (int i = 0; i < 9; i++) { 
    	
    		for (int j = 0; j < 9 ; j++) {
    			sumDálkar = sumDálkar + s[i][j];
       		}  		
			
			réttaSummaDálkar += 45;
    	} 

    }
}

