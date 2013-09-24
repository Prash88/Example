
public class LongestCommonSubsequenceDynamic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l1 = "prashanth";
		String l2 = "prabhut";
		//LongestCommonSubsequenceDynamic l = new LongestCommonSubsequenceDynamic();
		//System.out.println(l.longestSubStringValue(l1, l2));
		LongestCommonSubsequenceDynamic l = new LongestCommonSubsequenceDynamic();
		String []result = l.longestSubStringPath(l1, l2);
		for(int i=0;i<result.length;i++)
		{
			if(result[i]!=null)
			System.out.println(result[i]);
		}
	}
	
	public int longestSubStringValue(String l1, String l2)
	{
		String []li1 = l1.split("(?!^)");
		String []li2 = l2.split("(?!^)");
		int length1 = li1.length;  
		int length2 = li2.length;
		/*for(int i=0;i<length1;i++)
			System.out.print(li1[i]);
		System.out.println();
		for(int j=0;j<length2;j++)
			System.out.print(li2[j]);
		System.out.println(); */
		int mat[][] = new int[length1+1][length2+1];
		for(int i=0;i<length1+1;i++)
		{
			for(int j=0;j<length2+1;j++)
			{
				mat[i][j] = 0;
			}
		}
		for(int i=1;i<length1+1;i++)
		{
			for(int j=1;j<length2+1;j++)
			{
				if(li1[i-1].equals(li2[j-1]))
				{
					mat[i][j] = mat[i-1][j-1]+1;
				}
				else
				{
					mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
				}
			}
		}
		for(int i=0;i<length1+1;i++)
		{
			for(int j=0;j<length2+1;j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		return mat[length1][length2];		
	}
	public String[] longestSubStringPath(String l1, String l2)
	{
		String []li1 = l1.split("(?!^)");
		String []li2 = l2.split("(?!^)");
		int length1 = li1.length;  
		int length2 = li2.length;
		int mat[][] = new int[length1+1][length2+1];
		char path[][] = new char[length1+1][length2+1];
		String subString[] = new String[length1];
		for(int i=0;i<length1+1;i++)
		{
			for(int j=0;j<length2+1;j++)
			{
				path[i][j] = '*';
			}
		}
		for(int i=1;i<length1+1;i++)
		{
			for(int j=1;j<length2+1;j++)
			{
				if(li1[i-1].equals(li2[j-1]))
				{
					path[i][j] = '\\';
					mat[i][j] = mat[i-1][j-1]+1;
				}
				else if(mat[i][j-1]>=mat[i-1][j])
				{
					path[i][j] = '-';
					mat[i][j] = mat[i][j-1];
				}
				else
				{
					path[i][j] = '|';
					mat[i][j] = mat[i-1][j];
				}
			}
		}
		int i = length1;
		int j= length2;
		int id = 0;
		while(i>=1&&j>=1)
		{
				if(path[i][j]=='\\')
				{
					
					i--;
					j--;
					subString[id] = li1[i];
					id++;
				}
				else if(path[i][j]=='-')
				{
					j--;
				}
				else
				{
					i--;
				}
		}
		return subString;
	}

}
