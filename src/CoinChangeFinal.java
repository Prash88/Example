
public class CoinChangeFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {1,2,3,5};
		int sum = 10;
		int nos[]={0,0,0,0};
		CoinChangeFinal c= new CoinChangeFinal();
		   System.out.println("no of coins"+c.coinChange(coin,sum,nos));
	       System.out.println();
	       for(int i=0;i<coin.length;i++)
	       {
	           System.out.println(coin[i]+" : "+nos[i]);
	       }
		
	}
	
	public int coinChange(int []coin, int sum, int []nos)
	{
		if(sum < 0)
		{
			return 0;
		}
        int t,min=100,ind=0;
        for(int i=0;i<coin.length;i++)
        {
        	t=coinChange(coin,sum-coin[i],nos);
        	if(t<min)
        	{
        		min = t;
        		ind = i;
        	}
        }
        nos[ind] = 1;
        System.out.println(nos[2]);
		return min+1;
	}

}
