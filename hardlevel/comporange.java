import java.util.Scanner;
class Comrange
{
	public static void main(String arg[])
	{
		int a,b,i,j,ct;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a;i<=b;i++)
		{
			ct=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					ct++;
				}
			}
			if(ct!=2)
			{
				System.out.println(i);
			}
		}
	}
}