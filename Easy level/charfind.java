import java.util.Scanner;
class findchar
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word:");
		String input=sc.nextLine();
		System.out.println("Enter the character to be searched:");
		char ch=sc.nextLine().charAt(0);
		boolean found=false;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ch)
			{
				System.out.println("The char is found at:" + i);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("The char is not found in the string!");
		}
	}
}	