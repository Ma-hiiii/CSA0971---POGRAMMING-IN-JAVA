import java.util.Scanner;
class Perfect
{
	public static void main(String arg[])
	{
		int st,ed,num,i,temp,b,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range:");
		st=sc.nextInt();
		System.out.println("Enter the ending range:");
		ed=sc.nextInt();
		for(num=st;num<=ed;num++)
		{
			for(i=1;i*i<=num;i++)
			{
				if(i*i==num)
				{
					b=0;
					temp=num;
					while(temp>0)
					{
						a=temp%10;
						b+=a;
						temp=temp/10;
					}
					if(b<10)
					{
						System.out.println(num);
					}
					break;
				}
			}
		}
		System.out.println();
	}
}