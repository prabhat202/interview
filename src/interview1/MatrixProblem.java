package interview1;

public class MatrixProblem {
	public static void main(String[] args) {
//		int[][]mat = {{3, 1, 8}, {4, 6, 2}, {7, 5, 9}};
//		int[] arr = {5, 4, 8, 7, 6, 1, 9, 2, 3};
		
		int[][]mat = {{1, 6}, {2, 4}, {5, 3}};
		int[] arr = {2, 4, 3, 1, 5, 6};
		
		int row = mat.length;
		int col = mat[0].length;
		
		int[] markedRows = new int[row];
		int[] markedCols = new int[col];

		outerloop:
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					if (arr[i] == mat[j][k]) {
						System.out.println("***********************");
						System.out.println("Matched "+arr[i]);
						System.out.println("Before");
						printMatrix(markedRows, markedCols);
						markedRows[j] = markedRows[j] + 1 ;
						markedCols[k] = markedCols[k] + 1;
//						System.out.println("-------------------");
						System.out.println("After");
						printMatrix(markedRows, markedCols);
						if (markedRows[j] == col || markedCols[k] == row ) {
							System.out.println("Completed "+ arr[i]);
							break outerloop;
						}
						
					}
				}
			}
			
		}
		
		
	}

	private static void printMatrix(int[] markedRows, int[] markedColms) {
		// TODO Auto-generated method stub
		for (int i = 0; i < markedRows.length; i++) {
			System.out.print("Row-"+markedRows[i]+" ");
			
		}
		for (int i = 0; i < markedColms.length; i++) {
			System.out.print("Col-"+markedColms[i]+" ");
			
		}
		System.out.println();
		
	}

}
