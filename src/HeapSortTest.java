
public class HeapSortTest {

	int []values = new int[100];
	int n;
	int left;
	int right;
	int largest;
	public static void main(String[] args) {
		int []value = {3,5,4,2,1,1,2};
		HeapSortTest h = new HeapSortTest();
		h.sort(value);
		for(int i=0;i<value.length;i++)
			System.out.print(value[i]+" ");
	}
	public void sort(int []value)
	{
		values = value;
		buildHeap(values);
		for(int i=n;i>=0;i--)
		{
			exchange(i,0);
			n = n-1;
			maxHeap(values,0);
		}
	}
	public void maxHeap(int []values, int i)
	{
		left=2*i;
		right=(2*i)+1;
		if((left<=n)&&(values[i]<values[left]))
			largest = left;
		else
			largest = i;
		if((right<=n)&&(values[largest]<values[right]))
			largest = right;
		if(largest!=i)
		{
			exchange(i,largest);
			maxHeap(values,largest);
		}
	}
	public void buildHeap(int []values)
	{
		n = values.length-1;
		 for(int i=n/2;i>=0;i--){
	            maxHeap(values,i);
	        }
	
	}
	public void exchange(int i, int j)
	{
		int swap = values[i];
		values[i] = values[j];
		values[j] = swap;
	}

}
