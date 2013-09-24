
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {5,4,2,3,1};
		QuickerSort q = new QuickerSort(i);
		q.printer();
	}

}

class QuickerSort{

	int []numbers;
	int number;
	QuickerSort(int []values)
	{
		this.numbers = values;
		this.number = numbers.length;
		sort(0, number-1);
	}
	public void printer()
	{
		for(int i=0;i<number;i++)
			System.out.println(numbers[i]);
	}
	private void sort(int min, int max)
	{
		int i = min;
		int j = max;
		while(i<=j)
		{
			int pivot = numbers[(min+(max-min)/2)];
			while(pivot>numbers[i])
			{
				i++;
			}
			while(pivot<numbers[j])
			{
				j--;
			}
			int swap=numbers[i];
			numbers[i]=numbers[j];
			numbers[j]=swap;
			i++;
			j--;
 		}
		if(min<j)
		{
			sort(min,j);
		}
		if(i<max)
		{
			sort(i,max);
		}
	}
}