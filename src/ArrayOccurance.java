
public class ArrayOccurance {

	
	public static void main(String[] args) {
		
		int []values = {1,1,1,2,2,2};
		ArrayOccurance a = new ArrayOccurance();
		System.out.println(a.noofoccurances(2, values, 0, 5));
		
	}

	public int noofoccurances(int k, int []values, int start, int end)
	{
		
		if(end<start)
			return 0;
		if(values[start]>k)
			return 0;
		if(values[end]<k)
			return 0;
		if(values[start]==k && values[end]==k)
			return end-start +1;
		int mid = (start+end)/2;
		if(values[mid]<k)
			return noofoccurances(k,values,mid,end);
		else if(values[mid]==k)
			return (1+noofoccurances(k,values,start,mid-1)+noofoccurances(k,values,mid+1,end));
		else 
			return noofoccurances(k,values,start,mid);

	}
}
