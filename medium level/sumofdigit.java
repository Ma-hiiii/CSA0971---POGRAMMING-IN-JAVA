import java.util.Scanner;
class Sum
{
	public static void main(String arg[])
	{
		int n,a,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n!=0)
		{
			a=n%10;
			b=b+a;
			n=n/10;
		}
		System.out.println("Sum of Digits is:"+b);
	}
}