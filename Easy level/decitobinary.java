import java.util.Scanner;
class decimal
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal:");
		int n= sc.nextInt();
		String binary="";
		while(n>0)
		{
			int remain=n%2;
			binary=remain+binary;
			n/=2;
		}
		String reversed="";
		for(int i=binary.length()-1;i>=0;i--)
		{
			reversed+=binary.charAt(i);
		}
		System.out.println("The binary is:" + binary);
		System.out.println("The reversed binar is:" + Integer.parseInt(reversed,2));
	}
}