
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={5,4,2,3,1};
		int len = numbers.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				if(numbers[i]>numbers[j])
				{
					int swap = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = swap;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
