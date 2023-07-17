package closeLabBook;

public class Program10 {

	public static void main(String[] args) {
		 int[][] twod = {
		            {1, 2, 3, 4},
		            {5, 6, 7, 8},
		            {9, 10, 11, 12},
		            {13, 14, 15, 16}
		        };

		        displayNumberMatrix(twod);
		    }

		     static void displayNumberMatrix(int[][] matrix) {
		        for (int row = 0; row < matrix.length; row++) {
		            for (int col = 0; col < matrix[row].length; col++) {
		                System.out.print(matrix[row][col] + " ");
		            }
		            System.out.println();
		        }
		    
	}
}
