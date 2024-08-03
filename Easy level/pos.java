import java.util.Scanner;
class Pos
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive number");
		}else{
			System.out.println("Negative number");
		}
	}
}