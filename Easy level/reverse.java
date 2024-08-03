import java.util.Scanner;
class Reve
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
			b=b*10+a;
			n=n/10;
		}
		System.out.println("Reversed  number is:"+b);
	}
}