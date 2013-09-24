
public class LongestCommonSubsequence {

	public static void main(String args[])
	{
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		char a[]={'a','b','c','d'};
		char b[]={'a','c','d','b'};
		System.out.println(l.longestSub(3, 3, a, b));
		
	}
	public int longestSub(int i, int j,char []a, char []b)
	{
		if(i<0||j<0)
		{
			return 0;
		}
		if(a[i] == b[j])
		{
			return(longestSub(i-1,j-1,a,b))+1;
		}
		return Math.max(longestSub(i,j-1,a,b), longestSub(i-1,j,a,b));
		
	}
}
