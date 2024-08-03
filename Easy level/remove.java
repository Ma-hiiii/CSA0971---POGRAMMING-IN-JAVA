import java.util.Scanner;
class vowel
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter the string:");
		String n=sc.nextLine();
		String result="";
		for(char c:n.toCharArray())
		{
			if(!(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'))
			{
				result+=c;
			}
		}
		System.out.println("The string without vowels is:" + result);
	}
}