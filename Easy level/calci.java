import java.util.Scanner;
class Cal
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter the choice:");
		int choice= sc.nextInt();
		System.out.println("Enter the two numbers:");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		switch(choice)
		{
			case 1:
			{
				System.out.println("The Addition is:"+(a+b));
				break;
			}
			case 2:
			{
				System.out.println("The subraction is:"+(a-b));
				break;	
			}
			case 3:
			{
				System.out.println("The multiplication is:"+(a*b));
				break;
			}
			case 4:
			{
				if(b!=0)
				{
					System.out.println("The Division is:"+(a/b));
				}else{
					System.out.println("Invalid input");
				}
				break;
			}
			default:
			{
				System.out.println("Inavlid choice");
				break;
			}
		}
	}
}