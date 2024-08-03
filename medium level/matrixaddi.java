import java.util.Scanner;
class Matrix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns:");
		int rows=sc.nextInt();
		int col=sc.nextInt();
		int[][] matrix1=new int[rows][col];
		int[][] matrix2=new int[rows][col];
		int[][] sum=new int[rows][col];
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements in the second matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("the sum of matrix is:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(sum[i][j]+"");
			}
			System.out.println();
		}
	}
}