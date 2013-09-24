
public class MatrixShift {

	public static void main(String args[])
	{
		int matrix [][] = {{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,15,0}};
		int dimension = 4;
		MatrixShift m = new MatrixShift();
		m.ChangeMatrix(matrix,dimension);
		
	}
	
	public void ShiftPrint(int[][] matrix, int dimension)
	{
		for(int j=0; j<dimension/2; j++)
		{
			int last = dimension-1-j;
			for(int i=j; i< last; i++)
			{
				int offset = (i - j);
				int top = matrix[j][i];
				matrix[j][i] = matrix [last-offset][j];
				matrix [last-offset][j] = matrix [last][last-offset];
				matrix [last][last-offset] = matrix[j+offset][last];
				matrix[j+offset][last] = top;
			}
			
		}
		
		for(int k=0; k<dimension; k++)
		{
			for(int l=0; l<dimension; l++)
			{
				System.out.print(matrix[k][l]+" ");
			}
			System.out.println();
		}
	}
	
	public void ChangeMatrix(int[][] matrix, int dimension)
	{
		int[] row = new int[dimension];
		int[] column = new int[dimension];
		
		for(int i=0; i<dimension; i++)
		{
			for(int j=0; j<dimension; j++)
			{
				if(matrix[i][j] == 0)
				{
					row[i]++;
					column[j]++;
				}
			
			}
		}
		
		for(int i=0; i<dimension; i++)
		{
			if(row[i]>0)
			{
				for(int j=0; j<dimension; j++)
				{
					matrix[i][j]=0;
				}
			}
		}
		
		for(int i=0; i<dimension; i++)
		{
			if(column[i]>0)
			{
				for(int j=0; j<dimension; j++)
				{
					matrix[j][i]=0;
				}
			}
		}
		
		for(int k=0; k<dimension; k++)
		{
			for(int l=0; l<dimension; l++)
			{
				System.out.print(matrix[k][l]+" ");
			}
			System.out.println();
		}
	}
}
