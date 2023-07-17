package closeLabBook;

public class Program20 {

public static void main(String[] args) {
	

int[][] twod = {
        {1, 21, 3},
        {4, 5, 62},
        {7, 8, 93}
    };

   Matrix.findLargestInEachRow(twod);
}
}

class Matrix{ 
static void findLargestInEachRow(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
        int largest = matrix[row][0];
        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] > largest) {
                largest = matrix[row][col];
            }
        }
        System.out.println("Largest element in row " + row + ": " + largest);
    }}}
