
    import java.util.Scanner;

    public class Contest_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the matrix
        int n = scanner.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[n][n];
        
        // Input the matrix values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Variables to store the sums of the diagonals
        int LeftToRightDiagonalSum = 0;
        int RightToLeftDiagonalSum = 0;
        
      
        for (int i = 0; i < n; i++) {
            LeftToRightDiagonalSum += matrix[i][i];  // Sum of the left-to-right diagonal
            RightToLeftDiagonalSum += matrix[i][n - i - 1];  // Sum of the right-to-left diagonal
        }
   
        int DiagonalDifference = Math.abs(LeftToRightDiagonalSum - RightToLeftDiagonalSum);     //shows the abs difference of the lefttoright and righttoleft diagonals
        
        //result
        System.out.println(DiagonalDifference);
        
        scanner.close();
    }
}


