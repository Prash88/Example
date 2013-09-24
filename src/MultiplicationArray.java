
public class MultiplicationArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,8};
		int output[]={1,1,1,1};
		int left=1;
		int right=1;
		
		for(int i=0; i<4; i++)
		{
			output[i]*=left;
			output[4-i-1]*=right;
			left*=arr[i];
			right*=arr[4-i-1];
			
		}
		
		for(int i=0; i<4; i++)
		{
			System.out.println(output[i]);
		}
	}

}
 