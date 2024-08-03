import java.util.Scanner;
class Largest
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+"is Largest");
		}else{
			System.out.println(b+"is largest");
		}
	}
}