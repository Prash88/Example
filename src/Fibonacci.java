
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		//f.fibonacci_loop(10);
		//f.fibonacci_recursive(0, 1, 10);
		//for(int i=0;i<10;i++)
		//	System.out.println(f.fibonacci_divide(i));
		int []fib = f.fibonacci_dynamic(10);
		for(int i=0;i<fib.length;i++)
				System.out.println(fib[i]);
	}
	
	public void fibonacci_loop(int n)
	{
		int i = 0;
		int j = 1;
		
		for(int k=0;k<n;k++)
		{
			System.out.println(i);
			int s = i+j;
			i = j;
			j = s;
		}
	}
	
	public void fibonacci_recursive(int i, int j,int n)
	{		
			System.out.println(i);
			int s = i+j;
			i = j;
			j = s;
			n--;
			if(n>0)
				fibonacci_recursive(i,j,n);
	}
	public int fibonacci_divide(int n)
	{		
			if(n==0)
				return 0;
			else if(n==1)
				return 1;
			else
				return (fibonacci_divide(n-1)+fibonacci_divide(n-2));

	}
	public int[] fibonacci_dynamic(int n)
	{		
				int fib[] = new int[n];
				fib[0]=0;
				fib[1]=1;
				for (int i = 2; i < n; i++)
			            fib[i] = fib[i-1] + fib[i-2];
				return fib;

	}
}
