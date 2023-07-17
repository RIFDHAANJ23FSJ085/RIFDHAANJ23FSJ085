package closeLabBook;

public class Program19 {

	public static void main(String[] args) {
		
		int[][] twod= {
				{12,23,43},
				{56,76,87},
				{111,222,333}
		};
		ReverseTwod.reverseElementsInEachRow(twod);
	}
}

class ReverseTwod{
	static void reverseElementsInEachRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int start = 0;
            int end = matrix[row].length - 1;

            while (start < end) {
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("Reversed matrix:");
        printMatrix(matrix);
    }
	  static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
}}
