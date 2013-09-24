import java.awt.List;
import java.util.Arrays;


public class CoinChange {

	public static void main(String args[])
	{
		int i[] = {1,2,3,4,2,5,6};

		
	}
	public int coinchanger(int total, int i, int []totalmat)
	{
		if(total == 0)
			return 0;
		if(i==total)
		{
			return totalmat[i];
		}
		return i;
		
	}
}
