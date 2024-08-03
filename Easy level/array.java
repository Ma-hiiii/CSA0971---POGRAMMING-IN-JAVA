import java.util.Scanner;
class ascending
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Element "+ i+":");
			arr[i]=sc.nextInt();
		}
		System.out.println("The Elements Before soretd is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		System.out.println("Sorted array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}	