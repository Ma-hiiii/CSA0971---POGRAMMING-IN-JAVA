import java.util.Scanner;
class Perfect
{
	public static void main(String arg[])
	{
		int n,i,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				b+=i;
			}
		}
		if(b==n)
		{
			System.out.println("Perfect number");
		}else{
			System.out.println("Not a perfect number");
		}
	}
}