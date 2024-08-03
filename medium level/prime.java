import java.util.Scanner;
class Prime
{
	public static void main(String arg[])
	{
		int n,i,ct=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				ct++;
			}
		}
		if(ct==2)
		{
			System.out.println("Prime  number");
		}else{
			System.out.println("composite number");
		}
	}
}