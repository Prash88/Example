
public class LongestPalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromeString l = new LongestPalindromeString();
		System.out.print(l.longestPalindromeSubstring("asdsbaabsbasd"));
	}
	
	public String longestPalindromeSubstring(String value)
	{
		int strlen = value.length();
		boolean mat[][] =  new boolean[strlen][strlen];
		int begin = 0;
		int palinlen = 1;
		
		for(int i=0; i<strlen; i++)
			mat[i][i] = true;
		
		for(int i=0; i<strlen-1; i++)
		{
			if(value.charAt(i)==value.charAt(i+1))
			{
			mat[i][i+1] = true;
			begin = i;
			palinlen = 2;
			}
		}
		
		for(int len=3; len<strlen; len++)
		{
			for(int i=0; i<strlen-len+1; i++)
			{
				int j = len+i-1;
				if((value.charAt(i)==value.charAt(j))&&mat[i+1][j-1])
				{
					begin = i;
					palinlen =len;
					mat[i][j] = true;
				}
			}
		}
		
		return value.substring(begin, begin+palinlen);
	}

}
