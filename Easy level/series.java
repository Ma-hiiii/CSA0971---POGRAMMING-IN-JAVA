import java.util.Scanner;
class Sum
{
	public static void main(String arg[])
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("Sum of Series is :"+sum);
	}
}