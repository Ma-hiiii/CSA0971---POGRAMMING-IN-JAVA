import java.util.Scanner;
class gcd
{
	static int gcd(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);		
	}
	static int lcm(int a, int b)
	{
		return(a*b/gcd(a,b));	
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("The gcd of " + n1 + " and " + n2 + " is : " + gcd(n1,n2));
		System.out.println("The lcm of " + n1 + " and " + n2 + " is : " + lcm(n1,n2));
	}
}