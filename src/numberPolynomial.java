
public class numberPolynomial {

	/**
	 * @param args
	 */
	public int value2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 12231;
		numberPolynomial n = new numberPolynomial();
		n.value2=i;
		if(n.numPalindrome(i))
			System.out.println("Yes palindrome");
		else
			System.out.println("Not palindrome");
		
	}
	
	public boolean numPalindrome(int value1)
	{
		if(value1<0)
			return false;
		if(value1==0)
			return true;
		if((numPalindrome(value1/10))&&(value1%10 == value2%10))
		{
			value2 = value2/10;
			return true;
		}
		else
			return false;
	}
	
}
