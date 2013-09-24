
public class SubsetsumDynamic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[] = {12, 5, 5, 8, 4};
		int sum = 10;
		int n = 5;
		SubsetsumDynamic s = new SubsetsumDynamic();
		if(s.isSubsetSumDynamic(set, n, sum))
		{
			System.out.print("Yeah!!!");
		}
		else
		{
			System.out.print("No!!!");
		}
	}
	
	public boolean isSubsetSumDynamic(int set[], int n, int sum)
	{
		boolean mat[][] = new boolean[sum+1][n+1];
		for(int i=0; i<=n; i++)
			mat[0][i] = true;
		for(int i=1; i<=sum; i++)
			mat[i][0] = false;
		for(int i=1; i<=sum; i++)
		{
			for(int j=1; j<=n; j++)
			{
				mat[i][j] = mat[i][j-1];
				if(i>=set[j-1])
				{
					mat[i][j] = mat[i][j]||mat[i-set[j-1]][j-1];
				}
			}
		}
		for(int i=0; i<=sum; i++)
		{
			for(int j=0; j<=n; j++)
			{
				System.out.print(" "+mat[i][j]);
			}
			System.out.println();
		}
		return mat[sum][n];
	}
}
