import java.util.Scanner;
class Fact
{
	public static void main(String arg[])
	{
		int n,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is :"+fact);
	}
}	