public class Sudoku {

    public static String isSolution(int[][] s){
        
        // By til 2n vigra ur nxn fylkinu s
        int[][] allt = new int[18][9];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                allt[i][j] = s[i][j];
                allt[i+9][j] = s[j][i];
            }
        }

        // sortera alla vigranna
        allt = insertionSort(allt);

        // athuga hvort sorterudu vigrarnir gangi upp
        // med tvi ad athuga hvort ad aN-N = 0
        for (int i = 0; i < allt.length; i++ ) {
            for (int j = 0; j < allt[i].length; j++) {
                if(allt[i][j] - j - 1 != 0){
                    return "Ekki lausn";
                } 
            }
        }  
        return "Rett lausn";    
    }

    // insertion sort
    public static int[][] insertionSort(int[][] a){
        for (int j = 0; j < a.length; j++) {
            for (int i = 1; i < a[j].length; i++) {
                int tmp = a[j][i];
                int k;
                for (k = i-1; k >= 0 && tmp < a[j][k]; k-- ) {
                    a[j][k+1] = a[j][k];
                }
                a[j][k+1] = tmp;
            }
        }
        return a;
    }


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
    
        // Kóði til að staðfesta að s sé lögleg og athuga hvort t sé lögleg
       System.out.println(isSolution(s));
    }
}