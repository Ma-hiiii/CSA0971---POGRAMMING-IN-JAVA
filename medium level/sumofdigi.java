import java.util.Scanner;
class Sum
{
	public static void main(String arg[])
	{
		int a,b=0,n,or,r,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n!=0)
		{
			a=n%10;
			b=b+a;
			n=n/10;
		}
		System.out.println("Sum of digits is:"+b);
		or=b;
		while(b!=0)
		{
			r=b%10;
			s=s+r;
			b=b/10;
		}
		System.out.println("The sum of digits is:"+s);	
	}
}