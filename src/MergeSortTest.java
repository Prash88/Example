
public class MergeSortTest {

	int []values = new int[100];
	int []handler = new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[] = {2,2,1,1,4,5,6,0};
		MergeSortTest m = new MergeSortTest();
		m.sort(value);
	}
	
	public void sort(int []value)
	{
		values = value;
		mergesort(0,values.length-1);
		for(int i=0; i<values.length;i++)
			System.out.print(values[i]+" ");	
	}
	public void mergesort(int min, int max)
	{
		int middle;
		if(min<max)
		{
			middle = (min+max)/2; 
			mergesort(min,middle);
			mergesort(middle+1,max);
			merge(min, middle, max);
		}
		
	}
	public void merge(int min, int middle, int max)
	{
		 for (int m = min; m<=max; m++) {
			 handler[m] = values[m];
		    }
		int i = min;  
		int j = middle+1;
		int k = min;
		while((i<=middle)&&(j<=max))
		{
			if(handler[i]<handler[j])
			{
				values[k] = handler[i];
				i++;
				k++;
			}
			else
			{
				values[k] = handler[j];
				j++;
				k++;
			}
		}
		while(i<=middle)
		{
			values[k] = handler[i];
			i++;
			k++;
		}
	}
}
