import java.util.Scanner;
class Evendigit
{
	public static void main(String arg[])
	{
		int n,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n>0)
		{
			digit=n%10;
			if(digit%2==0)
			{
				sum+=digit;
			}
			n=n/10;
		}
		System.out.println("Sum of even digits is:"+sum);
	}
}

