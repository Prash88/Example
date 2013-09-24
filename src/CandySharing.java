import java.util.Scanner;


public class CandySharing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int candy[][] = new int[100][100];
        int round[] = new int[100];
        int count = 0;
		try {
	          while (scanner.hasNextLine()) 
	          {
	        	  int line = scanner.nextInt();
	              if(line==0)
	              {
	            	  break;
	              }
	              else
	              {  
	            	round[count] = line;
	            	int i=0;
	            	while (scanner.hasNextLine()) 
	      	        {
	    	        	  int no = scanner.nextInt();
	    	        	  candy[count][i] = no;
	    	        	  i++;
	    	        	  if(i==round[count])
	    	        		  break;
	      	        }
	            	count++;
	              }
	          }
	          scanner.close();
	      } catch (Exception e) {
	          e.printStackTrace();
	      }
		
		for(int j=0;j<count;j++)
		{
			candyShare(round[j],candy[j]);
		}
	}
	
	public static void candyShare(int count, int candy[])
	{
		/*for(int i=0;i<count;i++)
		{
			System.out.println(candy[i]);
		}*/
		int candyCount = 0;
		while(shouldCandyShare(count,candy))
		{
			candyCount++;
			int adding = 0;
			for(int i=count-1;i>=0;i--)
			{
				if(i==count-1)
				{
					adding = candy[count-1]/2;
				}
				if(i==0)
				{
					candy[i] = (candy[i]/2 + adding);
				}
				else
				{
					candy[i] = (candy[i]/2 + candy[i-1]/2);
				}
			}
			candy = teacherShare(count,candy);
		}
		System.out.println(candyCount+" "+candy[0]);
	}
	public static boolean shouldCandyShare(int count, int candy[])
	{
		int no=candy[0];
		int j=0;
		for(int i=1;i<count;i++)
		{
			if(no!=candy[i])
			{
				j++;
			}
		}
		//System.out.println("j:"+j);
		if(j>0)
			return true;
		else
			return false;
	}
	public static int[] teacherShare(int count, int candy[])
	{
		for(int i=0;i<count;i++)
		{
			if((candy[i]%2)!=0)
			{
				candy[i]+=1;
			}
		}
		return candy;
	}
}
