import java.util.Scanner;
class Leap
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		n=sc.nextInt();
		if(n%4==0 && n%100!=0 || n%400==0)
		{
			System.out.println("It is a Leap Year");
		}else{
			System.out.println("It is not a Leap Year");
		}
	}
}