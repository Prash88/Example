
public class SquareRoot {

	public static void main(String[] args) {
		
		SquareRoot s = new SquareRoot();
		System.out.println(s.sqrt(55));

	}

	public double sqrt(double val)
	{
		double precision = 0.00000001;
		double start = 1;
		double end = val;
		if(val==0 || val==1)
			return val;
		if(val<1)
			end=1;
		while((end-start)>precision)
		{
			double mid = (start+end)/2;
			if(mid*mid==val)
				return mid;
			else if(mid*mid>val)
			{
				end = mid;
			}
			else
			{
				start = mid;
			}
		}
		return (start+end)/2;
	}
}
