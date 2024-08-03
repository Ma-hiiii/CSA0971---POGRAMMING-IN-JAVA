import java.util.Scanner;
class Rect
{
	public static void main(String arg[])
	{
		int r,c,i,j;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		r=sc.nextInt();
		c=sc.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}  