
public class SubsetSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[] = {12, 5, 5, 8, 4};
		int sum = 11;
		int n = 5;
		SubsetSum s = new SubsetSum();
		if(s.isSubsetSum(set, n, sum))
		{
			System.out.print("Yeah!!!");
		}
		else
		{
			System.out.print("No!!!");
		}
	}
	
	public boolean isSubsetSum(int set[], int n, int sum)
	{
		if(sum == 0)
			return true;
		if(n==0 && sum!=0)
			return false;
		if(set[n-1]>sum)
			return isSubsetSum(set, n-1, sum);
		return isSubsetSum(set, n-1, sum)||isSubsetSum(set, n-1, sum-set[n-1]);
	}

}
