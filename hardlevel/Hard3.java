import java.util.Scanner;
class Factor
{
	public static void main(String arg[])
	{
		int n,i,ct=0,nth;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				ct++;
			}
		}
		System.out.println("The Number of factors are:"+ct);
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
					System.out.println("The " +nth+ "factor of" +n+ "is :" +i);
				        break;
				}
			}
		}
	}
}