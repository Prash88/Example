
public class HeapSort {

	/**
	 * @param args
	 */
	int []values = new int[100];
	int n;
	int largest;
	int left;
	int right;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []value = {1,5,3,3,1,2};
		HeapSort h = new HeapSort();
		h.sort(value);
		for(int i=0; i<value.length;i++)
			System.out.print(value[i]+" ");
	}
	public void sort(int []value)
	{
		values = value;
        buidHeap(value);
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxHeap(value, 0);
        }
	}
	public void maxHeap(int []value, int i)
	{
		left = 2*i;
		right = (2*i)+1;
        if(left <= n && value[left] > value[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && value[right] > value[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxHeap(value, largest);
        }
	}
	public void buidHeap(int []value)
	{
		n = value.length-1;
		for(int i=n/2;i>=0;i--){
	            maxHeap(value,i);
	    }
		
	}
	public void exchange(int i, int j)
	{
		int swap = values[i];
		values[i] =  values[j];
		values[j] = swap;
	}

}
