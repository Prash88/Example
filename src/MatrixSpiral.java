
public class MatrixSpiral {

	public static void main(String[] args) {
		char[][] mat ={{'i','l','o','v','e'},{'d','i','n','t','e'},{'n','e','w','e','p' },{'a','i','v','r','i'},{'m','a','x','e','c' }};
		int min_i = 0;
		int min_j = 0;
		int max_i = 4;
		int max_j = 4;
		do
		{
			for(int i=min_j;i<max_j;i++)
			{
				System.out.print(mat[min_j][i]);
			}
			for(int i=min_i;i<max_i;i++)
			{
				System.out.print(mat[i][max_i]);
			}
			for(int i=max_j;i>min_j;i--)
			{
				System.out.print(mat[max_i][i]);
			}
			for(int i=max_i;i>min_i;i--)
			{
				System.out.print(mat[i][min_j]);
			}
			max_i--;
			max_j--;
			min_i++;
			min_j++;
		}while((min_i!=max_i)||(min_j!=max_j));
		System.out.print(mat[max_i][max_j]);
	}

}
