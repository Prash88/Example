
public class insertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[]={3, 5, 2 , 1, 0};
		insertionSort i = new insertionSort();
		val = i.insertSort(val);
		for(int j=0;j<val.length;j++)
			System.out.print(val[j]+" ");

	}
	public int[] insertSort(int []val)
	{
		int []values=val;
		int len = values.length;
		int key;
		int j;
		for(int i=1;i<len;i++)
		{	key = values[i];
			for(j=i-1;(j>=0)&&(key<values[j]);j--)
			{
				values[j+1] = values[j];
			}
			values[j+1] = key;
		}

		return values;
	}

}
