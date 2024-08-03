import java.util.Scanner;
class Palin
{
	public static void main(String arg[])
	{
		int n,a,b=0,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		t=n;
		while(n!=0)
		{
			a=n%10;
			b=b*10+a;
			n=n/10;
		}
		if(b==t)
		{
			System.out.println("Palindrome");
		}else{
			System.out.println("Not an palindrome");
		}
	}
}