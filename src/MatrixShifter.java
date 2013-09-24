
public class MatrixShifter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int dimension = 4;
		for(int i=0;i<dimension/2;i++)
		{
			int last = dimension-i-1;
			for(int j=i; j<last; j++)
			{
				int offset = j - i;
				int first = matrix[i][j];
				matrix[i][j] = matrix[last-offset][i];
				matrix[last-offset][i] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i+offset][last] = first;
				
			}
		}
		
		for(int i=0;i<dimension;i++)
		{
			for(int j=0;j<dimension;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
