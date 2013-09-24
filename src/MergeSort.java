
public class MergeSort {

	int []values = new int[100];
	int []handler = new int[100];

	public static void main(String []args)
	{
		int value[] = {5,2,2,1,3};
		MergeSort m = new MergeSort();
		m.sort(value);
	}
	public void sort(int []value)
	{
		System.out.println("yeah");
		values = value;
		int min = 0;
		int max = values.length-1;
		for (int g = min; g <= max; g++) 
		      handler[g] = values[g];
		mergesort(min, max);
		for(int i=0; i<=max; i++)
			System.out.println(values[i]);
	}
	public void mergesort(int min, int max)
	{
		int i = min;
		int j = max;
		int middle;
		if(i<j)
		{
			middle = (i+j)/2;
			mergesort(i,middle);
			mergesort(middle+1,j);
			merge(i,middle,j);
		}
	}
	public void merge(int min, int middle, int max)
	{
		int i = min;
		int j =  middle+1;
		int k = min;
		while((i <= middle) && (j<=max))
		{
			if(values[i]<=values[j])
			{
				handler[k] = values[i];
				i++;
			}
			else
			{
				handler[k] = values[j];
				j++;
			}
			k++;
		}
		while(i <= middle)
		{
			handler[k] = values[i];
			i++;
			k++;
		}
		for(int m=0;m<k;m++)
			values[m] = handler[m];
	}
}
