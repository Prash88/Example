
public class Manchestersalgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manchestersalgorithm l = new Manchestersalgorithm();
		System.out.println(l.longestPalindromeSubs("asdsbaabsbasd"));
	}
	
	public String preprocess(String value)
	{
		String returnString = "";
		char []valueArray = value.toCharArray();
		for(int i=0;i<valueArray.length;i++)
		{
			returnString = returnString+"#"+valueArray[i];
		}
		returnString = returnString+"#";
		return returnString;
	}
	
	public String longestPalindromeSubs(String value)
	{
		String t = preprocess(value);
		int len = t.length();
		int p[] = new int[len];
		int center = 0;
		int r = 0;
		for(int i=1;i<len-1;i++)
		{
			int i_mirror = 2*center-i;
			if(r>i)
				p[i]=Math.min((r-i), p[i_mirror]);
			else
				p[i]=0;
			while((i-1>=p[i]) && (i+p[i]+1<len) && (t.charAt(i+p[i]+1))==(t.charAt(i-p[i]-1)))
				p[i] = p[i]+1;
			if(i+p[i]>r)
			{
				center = i;
				r = i+p[i];
			}
		}

		int maxLength = 0;
		int centerIndex = 0;

		for(int i=1;i<len-1;i++)
		{
			if(p[i]>maxLength)
			{
				maxLength = p[i];
				centerIndex = i;
			}
		}
		System.out.println(t);
		System.out.println(centerIndex+" "+maxLength);
		return t.substring(centerIndex-maxLength,centerIndex+maxLength);
	}

}
