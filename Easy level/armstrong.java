import java.util.Scanner;
class Arm
{
	public static void main(String arg[])
	{
		int a,n,b=0,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		t=n;
		while(n!=0)
		{
			a=n%10;
			b=b+(a*a*a);
			n=n/10;
		}
		if(t==b)
		{
			System.out.println("Armstrong");
		}else{
			System.out.println("Not an armstrong");
		}
	}
}