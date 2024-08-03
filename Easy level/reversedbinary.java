import java.util.Scanner;
class decimal
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int n=sc.nextInt();
		String binary="";
		while(n>0)
		{
			int a=n%2;
			binary=a+binary;
			n=n/2;
		}
		String reversedbinary="";
		for(int i=binary.length()-1;i>=0;i--)
		{
			reversedbinary+=binary.charAt(i);
		}
		System.out.println("The binary number:"+binary);
		System.out.println("The reversed binary is:"+reversedbinary);
	}
}