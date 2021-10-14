package arrays;



public class MatrixPrinting {
	
	/*public static void printMatrix(int mat[][])
	{
		// Loop through all rows
		for (int[] row : mat)
			//convert each row as a string
			//and then printing in a separate line
			System.out.println(Arrays.toString(row));
	}*/
	public static void main(String[] args) {
		
		 int[][] matrix = {
	               {8, 1, 6},
	               {3, 5, 7},
	               {4, 9, 0},
	       };
	       //output the numbers
	       for (int i = 0; i < matrix.length; i++) {
	           for(int j = 0; j < matrix[i].length; j++)
	            System.out.println(matrix[i][j]);
	       }
	}
}