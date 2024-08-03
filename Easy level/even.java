import java.util.Scanner;
class Even
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
	}
}