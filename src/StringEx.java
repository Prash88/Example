
public class StringEx {

	public static void main(String args[])
	{
		
		StringEx s1 = new StringEx();
		String s2 = "Yeah yeah     ";
		System.out.println(s1.ReplaceStringPercent(s2.toCharArray(),8));
		
		if(s1.CheckPermutation("yeah","eyah"))
		{
			System.out.print("Same");
		}
		else
		{
			System.out.print("Different");
		}
	}
	
	//ex 1.3
	public boolean CheckPermutation(String s1, String s2)
	{
		int[] letters = new int[200];
		if(s1.length() != s2.length())
		{
			return false;
		}
		for(int i=0;i<s1.length(); i++)
		{
			letters[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length(); i++)
		{
			letters[s1.charAt(i)]--;
			if(letters[s1.charAt(i)] < 0)
			{
				return false;
			}
		}
		return true;
	}
	
	//ex 1.4 %20 insert
	public char[] ReplaceStringPercent(char[] s, int len)
	{
		int strLen = len;
		int spaceLen = 0;
		int charLen = 0;
		for(int i=0;i<strLen;i++)
		{
			if(s[i]==' ')
				spaceLen++;
			else
				charLen++;
		}
		s[spaceLen*3+charLen+1]='\0';
		for(int i=0;i<len;i++)
		{
			if(s[i]==' ')
			{
				s[spaceLen*3+charLen-i] = '0';
				s[spaceLen*3+charLen-i-1] = '2';
				s[spaceLen*3+charLen-i-2] = '%';
			}
		}
		return s;
	}
	//ex 1.5 string compress
	
}
