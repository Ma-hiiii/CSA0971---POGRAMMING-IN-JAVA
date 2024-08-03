import java.util.Scanner;
class Right
{
	public static void main(String arg[])
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}