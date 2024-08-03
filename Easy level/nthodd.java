import java.util.Scanner;
class nthodd
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the N value:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println((2*i+1 + " ");
		}
		int a=2*(n-1)+1;
		int b= a+2*n;
		System.out.println(b);
	}
}