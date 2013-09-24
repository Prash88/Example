
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= {2,5,3,1,4,6,2,1,5,7,10};
		int len = 11;
		SelectionSort s = new SelectionSort();
		num = s.selectSort(num, len);
		
		for(int i=0;i<len;i++)
			System.out.print(num[i]+" ");
	}
	
	public int [] selectSort(int []num, int len)
	{
		int minIndex = 0;
		int indexSorted = 0;
		while(indexSorted<len)
		{
			for(int i=(indexSorted+1); i<len; i++)
			{
				if(num[i]<num[minIndex])
				{
					minIndex = i;
				}
			}
			int swap = num[indexSorted];
			num[indexSorted] = num[minIndex];
			num[minIndex] = swap;
			indexSorted++;
			minIndex = indexSorted;
		}
		return num;
	}
}
