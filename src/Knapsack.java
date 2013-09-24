
public class Knapsack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weights[] = {2, 3, 4, 5};
		int benifits[] = {300000, 40000000, 5000000, 60000};
		int w = 5;
		int i = 3;
		
		Knapsack k = new Knapsack();
		System.out.println(k.knapbenifit(weights, benifits, w, i));
	}
	
	public int knapbenifit(int weights[], int benifits[], int w, int i)
	{
		if(w == 0 || i < 0)
		{
			return 0;
		}
		if( w - weights[i] < 0)
		{
			return 0;
		}
		return Math.max(knapbenifit(weights, benifits, w, i-1), benifits[i]+knapbenifit(weights, benifits, w-weights[i], i-1));
		
	}

}
