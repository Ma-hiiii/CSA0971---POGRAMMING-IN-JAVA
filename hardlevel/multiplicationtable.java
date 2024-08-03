import java.util.Scanner;
class mul
{
	public static void main(String arg[])
	{
		int n,i,j,n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		System.out.println("Enter the another number:");
		n1=sc.nextInt();
		System.out.println("Multiplication table for "+ n + ":");
		for(i=1;i<=10;i++)
		{
			System.out.println(n+ " X " + i + " = " + (n*i));
		}
		System.out.println("Multiplication table for " + n1 + ":");
		for(j=1;j<=10;j++)
		{
			System.out.println(n1 + " X " + j + " = " + (n1*j));
		}
	}
}