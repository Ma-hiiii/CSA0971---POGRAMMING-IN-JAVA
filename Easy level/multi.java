import java.util.Scanner;
class Mul
{
	public static void main(String arg[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}
}