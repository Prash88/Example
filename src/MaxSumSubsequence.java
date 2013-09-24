
public class MaxSumSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nos[]={1,-2,3,6,8,-5,3};
		MaxSumSubsequence m = new MaxSumSubsequence();
		System.out.print(m.maxSum(nos));

	}
	
	public int maxSum(int []nos)
	{
		int[] maxSumArray = new int[nos.length];
		maxSumArray[0] = nos[0];
		for(int i=1; i<nos.length; i++)
		{
			maxSumArray[i] = Math.max(nos[i], maxSumArray[i-1]+nos[i]);
		}
		return maxSumArray[nos.length-1];
	}

}
