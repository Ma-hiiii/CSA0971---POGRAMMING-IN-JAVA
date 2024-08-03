import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections; 
class Asc
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number of names:");
		n=sc.nextInt();
		sc.nextLine();
		String[] nam=new String[n];
		System.out.println("Enter the names:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Name"+(i+1)+":");
			nam[i]=sc.nextLine();
		}
		Arrays.sort(nam);
		System.out.println("Names in ascending order:");
		for(String name:nam)
		{
			System.out.println(name);
		}
		Arrays.sort(nam, Collections.reverseOrder());
        	System.out.println("Names in descending order:");        	
		for (String names : nam)
		{
            		System.out.println(names);
       		}

	}
}