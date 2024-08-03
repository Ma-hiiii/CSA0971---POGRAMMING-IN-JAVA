import java.util.Scanner;
class Fact
{
	public static void main(String arg[])
	{
		int n,i,ct=0,nth;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				ct++;
				System.out.println(i);
			}
		}
		System.out.println("The number of factors is:"+ct);
		System.out.println("Enter the nth number:");
		nth=sc.nextInt();
		ct=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				ct++;
				if(ct==nth)
				{
					System.out.println("The" + nth + "Factor of " + n + "is:"+i);
					break;
				}
			}
		}
	}
}	